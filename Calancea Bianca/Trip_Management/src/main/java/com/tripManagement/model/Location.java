package com.tripManagement.model;

public class Location {
	public Location(String name, double longitude, double latitude) {
		super();
		long_name = name;
		lng = longitude;
		lat = latitude;
	}
	public Location(Location tmp)
	{
		long_name=tmp.getName();
		lng=tmp.getLongitute();
		lat=tmp.getLatitude();
	}
	String long_name;
	double lng;
	double lat;
	public String getName() {
		return long_name;
	}
	public double getLongitute() {
		return lng;
	}
	public double getLatitude() {
		return lat;
	}
	@Override
	public String toString() {
		return "Location [Name=" + long_name + ", Longitute=" + lng + ", Latitude=" + lat + "]";
	}
	
}
