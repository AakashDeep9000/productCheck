package com.stackroute.matchmaker.model;

public class Location {
	private String location_userId;
	private String location;

	public Location(String location_userId, String location) {
		super();
		this.location_userId = location_userId;
		this.location = location;
	}

	public Location() {
	}

	public String getLocation_userId() {
		return location_userId;
	}

	public void setLocation_userId(String location_userId) {
		this.location_userId = location_userId;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Location [location_userId=" + location_userId + ", location=" + location + "]";
	}
}
