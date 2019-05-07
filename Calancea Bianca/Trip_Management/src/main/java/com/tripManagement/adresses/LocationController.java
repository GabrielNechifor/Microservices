package com.tripManagement.adresses;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.tripManagement.model.Location;


@RestController
public class LocationController {

	@Autowired
	LocationService locationController;
	
	@RequestMapping("trip/getLocation/{point}")
	public Location getLocation(@PathVariable String point) throws IOException
	{
		Location tmp = locationController.getLocation(point);
		return tmp;
	}
	
	@RequestMapping("/trip/getDistance/{startPoint}/{endPoint}")
	public double getDistance(@PathVariable String startPoint,@PathVariable String endPoint) throws IOException
	{
		return locationController.getDistance(startPoint, endPoint);
	}
	
	
	@RequestMapping("/trip/getDuration/{startPoint}/{endPoint}")
	public String getDuration(@PathVariable String startPoint,@PathVariable String endPoint) throws IOException
	{
		return locationController.getDuration(startPoint, endPoint);
	}
	
}
