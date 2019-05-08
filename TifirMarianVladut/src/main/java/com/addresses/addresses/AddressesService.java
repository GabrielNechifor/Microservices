package com.addresses.addresses;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.addresses.model.Distance;
import com.addresses.model.Location;

@Service
public class AddressesService {

	private Location locationService;
	Distance distanceService;

	public Location getLocationService() {
		return locationService;
	}

	public void setLocationService(Location locationService) {
		this.locationService = locationService;
	}
	
	public Location getLocation(String name) throws IOException{
	    
		RestTemplate restTemplate = new RestTemplate();
		Map<String, String> vars = new HashMap<String, String>();
		String result = restTemplate
		.getForObject(
		"https://maps.googleapis.com/maps/api/geocode/json?address="+name+",+CA&key=AIzaSyAaeuKLQIt_tlLgluRv9uYcBnmN0-eqM_4",
		String.class, vars);
		ObjectMapper mapper = new ObjectMapper();
			JsonNode actualObj = mapper.readTree(result);
			JsonNode latNode =actualObj.path("results").path(0).path("geometry").path("location").get("lat");
			JsonNode lngNode =actualObj.path("results").path(0).path("geometry").path("location").get("lng");
			Location tmp = new Location(name
					,Double.parseDouble(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(lngNode))
					,Double.parseDouble(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(latNode)));
			return tmp;
	
	}
	
	
	public Distance getDistance(String startPoint,String endPoint) throws IOException
	{
		RestTemplate restTemplate = new RestTemplate();
		Map<String, String> vars = new HashMap<String, String>();
		String result = restTemplate
		.getForObject(
		"https://maps.googleapis.com/maps/api/distancematrix/json?units=metric&origins="+startPoint+
		"&destinations="+endPoint+"&key=AIzaSyAaeuKLQIt_tlLgluRv9uYcBnmN0-eqM_4",
		String.class, vars);
		ObjectMapper mapper = new ObjectMapper();
		JsonNode actualObj = mapper.readTree(result);
		JsonNode distanceNode =actualObj.path("rows").path(0).path("elements").path(0).path("distance").get("text");
		JsonNode durationNode =actualObj.path("rows").path(0).path("elements").path(0).path("duration").get("text");
		Location strPoint = getLocation(startPoint);
		Location ePoint = getLocation(endPoint);
		Distance distanceBTWPoints = new Distance(strPoint,ePoint,
				mapper.writerWithDefaultPrettyPrinter().writeValueAsString(distanceNode).replace("\"", ""),
				mapper.writerWithDefaultPrettyPrinter().writeValueAsString(durationNode).replace("\"", ""));
		return distanceBTWPoints;
		
		
	}
	
}
