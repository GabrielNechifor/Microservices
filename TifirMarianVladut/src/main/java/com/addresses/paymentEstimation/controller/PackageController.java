package com.addresses.paymentEstimation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.addresses.paymentEstimation.service.PackageService;


@RestController
public class PackageController {
	@Autowired
	PackageService packageController;
	
	@RequestMapping("/estimatePrice/{volume}/{weight}/{distance}")
	public float Estimate(@PathVariable float volume,@PathVariable float weight,@PathVariable float distance)
	{
		return  packageController.EstimatePrice(volume, weight, distance);
	}
}
