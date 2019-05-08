package com.packages.paymentEstimation;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class PackageController {
	@Autowired
	PackageService packageController;
	
	@RequestMapping("/estimatePrice/{id}")
	public float Estimate(@PathVariable int id) throws IOException
	{
		return  packageController.EstimatePrice(id);
	}
}
