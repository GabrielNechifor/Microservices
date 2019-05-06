package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class PackageService {
	
	Package packageService;
	float pricePerKg[][]= {{0,1,5},{2.5f,1.75f,1.2f}}; // <1kg , 1-5kg ,>5kg , pretul pt greutatea fiecarui kg
	float pricePerVolume[][] = {{0,1500,3,395},{1.3f,1.85f,2.22f}}; // 3395l este max in media la o masina medie
	float priceOf100km_h = 5*5.68f; // 5l 100/km , 5.68 litru de benzina
	public float EstimatePrice(float volume,float kilograms,float distance)
	{
		float price =0;
		
		double weightPrice = kilograms > pricePerKg[0][0] ? (kilograms >= pricePerKg[0][2] ? pricePerKg[1][2] : pricePerKg[1][1])
				 : pricePerKg[1][0];
		double volumePrice = volume > pricePerVolume[0][0] ? 
				( volume >= pricePerVolume[0][2] ? pricePerVolume [1][2] : pricePerVolume[1][1]) : pricePerVolume[1][0];
		double distancePrice = priceOf100km_h * distance;
		price = (float)(weightPrice + volumePrice + distancePrice)*19/100; // 19/100 - TVA
		return price;
		
	}
}
