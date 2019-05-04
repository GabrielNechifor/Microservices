package com.packages.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name="addresses")
public class Location {
	public Location(Integer id, String name, double longitude, double latitude) {
		super();
		Id = id;
		long_name = name;
		lng = longitude;
		lat = latitude;
	}
	public Location( String name, double longitude, double latitude) {
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
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	int Id;
	@Column(name="name")
	String long_name;
	@Column(name="longitude")
	double lng;
	@Column(name="latitude")
	double lat;
	public int getId() {
		return Id;
	}
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
