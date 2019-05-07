package com.packages.getPackagesDriver;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.packages.model.CommandsHistory;
import com.packages.repositories.CommandsHistoryRepository;

@Service
public class GetPackagesService {
	
	@Autowired
	private CommandsHistoryRepository commandsHistoryRepository;
	
	public List<CommandsHistory> getPackages(String location) throws IOException {
		List<CommandsHistory> cmd= new ArrayList<CommandsHistory>();
		List<CommandsHistory> result= new ArrayList<CommandsHistory>();
		cmd=commandsHistoryRepository.findAll();
	   for(CommandsHistory i:cmd) {
		
		BufferedReader reader = null ;
		URL url = new URL("http://localhost:8083/trip/getDistance/"+location+"/"+i.getReceiver_adress());
	    HttpURLConnection con = (HttpURLConnection) url.openConnection();
	    
	    con.setRequestMethod("GET");
	    con.setRequestProperty("Content-Type", "application/json");	    
	   
	    con.setDoInput(true);
		reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
		String json = reader.lines().collect(Collectors.joining("\n"));
		Double distance= Double.parseDouble(json);
	//	 Gson gson = new Gson();
		// ProfilesSender user= gson.fromJson(json, ProfilesSender.class);
		if(distance<4) result.add(i);
	   }
		return result;
	}
	
	
	
	
	
	
	
	
}
