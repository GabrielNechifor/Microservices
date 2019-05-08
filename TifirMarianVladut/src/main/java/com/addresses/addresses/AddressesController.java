package com.addresses.addresses;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.addresses.model.Distance;
import com.addresses.model.Location;


@RestController
public class AddressesController {

	@Autowired
	AddressesService locationController;
	@RequestMapping("/getLocation/{point}")
	public Location getLocation(@PathVariable String point) throws IOException
	{
		Location tmp = locationController.getLocation(point);
		return tmp;
	}
	@RequestMapping("/getDistance/{startPoint}/{endPoint}")
	public Distance getDistance(@PathVariable String startPoint,@PathVariable String endPoint) throws IOException
	{
		Distance tmp = locationController.getDistance(startPoint, endPoint);
		return tmp;
	}
}
