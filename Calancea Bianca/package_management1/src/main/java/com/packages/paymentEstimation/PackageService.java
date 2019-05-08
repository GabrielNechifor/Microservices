package com.packages.paymentEstimation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.packages.model.CommandsHistory;
import com.packages.repositories.CommandsHistoryRepository;

@Service
public class PackageService {
	@Autowired
	CommandsHistoryRepository commandsHistoryRepository;
	
	public float EstimatePrice(int id) throws IOException
	{   CommandsHistory cmd= new CommandsHistory();
	 	cmd= commandsHistoryRepository.findById(id).get();
	 	float kilograms=cmd.getKilograms();
	 	float volume=cmd.getVolume();
		float weight;
		String address2=cmd.getReceiver_adress();
		String address1=cmd.getSender_adress();
		float distance;
		
		BufferedReader reader = null ;
		URL url = new URL("http://localhost:8083/trip/getDistance/"+address1+"/"+address2);
	    HttpURLConnection con = (HttpURLConnection) url.openConnection();
	    
	    con.setRequestMethod("GET");
	    con.setRequestProperty("Content-Type", "application/json");	    
	   
	    con.setDoInput(true);
		reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
		String json = reader.lines().collect(Collectors.joining("\n"));
		distance= Float.parseFloat(json);
		
		float priceOf100km_h = 12*5.68f;
		if(kilograms>volume/6000) weight=kilograms;
		else weight=volume/6000;
		float price =0;
		float distancePrice = priceOf100km_h/100 * distance;
		price=weight*2.121f+ distancePrice;
		return price;
		
		
	}
}
