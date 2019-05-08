package com.paymentEstimation.service;

import org.springframework.stereotype.Service;

@Service
public class PackageService {
	
	Package packageService;
	float pricePerKg[][]= {{0,1,5},{1.2f,1.75f,2.5f}}; // <1kg , 1-5kg ,>5kg , pretul pt greutatea fiecarui kg
	float pricePerVolume[][] = {{0,1500,3,395},{1.3f,1.85f,2.22f}}; // 3395l este max in media la o masina medie
	float priceOf100km_h = 5*5.68f; // 5l 100/km , 5.68 litru de benzina
	public float EstimatePrice(float volume,float kilograms,float distance)
	{   float weight;
		if(kilograms>volume/6000) weight=kilograms;
		else weight=volume/6000;
		float price =0;
		float distancePrice = priceOf100km_h/100 * distance;
		price=weight*1.2f+ distancePrice;
		return price;
		
		
	}
}
