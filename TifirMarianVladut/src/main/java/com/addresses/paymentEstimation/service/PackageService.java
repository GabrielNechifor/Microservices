package com.addresses.paymentEstimation.service;

import org.springframework.stereotype.Service;

@Service
public class PackageService {
	
	Package packageService;
	float pricePerKg[][]= {{0,1,5},{2.5f,1.75f,1.2f}}; // <1kg , 1-5kg 5kg> , pretul pt greutatea fiecarui kg
	float pricePerVolume[][] = {{0,1500,3395},{1.3f,1.85f,2.22f}}; // 3395l este max in media la o masina medie
	float priceOf100km_h = 5*5.68f; // 5l 100/km , 5.68 litru de benzina
	public float EstimatePrice(float volume,float kilograms,float distance)
	{
		float price =0;
		
		
		float distancePrice = priceOf100km_h/100 * distance;
		price = distancePrice; // 19/100 - TVA
		return price;
		
	}
}
