package com.java.design.patterns.Observer2;

public class User implements Observer{
	private String location;
	
	
	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	@Override
	public void update(String location) {
			this.location = location;
			showLocation();
	}


	@Override
	public void showLocation() {
		System.out.println("To User -- Current Location is :"+location);
		
	}

}