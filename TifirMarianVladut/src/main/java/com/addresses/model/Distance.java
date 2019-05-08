package com.addresses.model;

public class Distance {
	
	public Distance(Location startingPoint, Location endPoint, String distance, String time) {
		super();
		this.startingPoint = startingPoint;
		this.endPoint = endPoint;
		this.distance = distance;
		this.time = time;
	}
	Location startingPoint;
	Location endPoint;
	String distance;
	String time;
	public Location getStartingPoint() {
		return startingPoint;
	}
	public void setStartingPoint(Location startingPoint) {
		this.startingPoint = startingPoint;
	}
	public Location getEndPoint() {
		return endPoint;
	}
	public void setEndPoint(Location endPoint) {
		this.endPoint = endPoint;
	}
	public String getDistance() {
		return distance;
	}
	public void setDistance(String distance) {
		this.distance = distance;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "From:" + startingPoint + "\nTo:" + endPoint + ", distance=" + distance
				+ "\n time=" + time;
	}
	
}
