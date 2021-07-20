package com.java.design.patterns.Observer2;

public class DeliveryWareHouseCenter implements Observer{
	private String location;
	
	
	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
		showLocation();
	}


	@Override
	public void update(String location) {
			this.location = location;
	}


	@Override
	public void showLocation() {
		System.out.println("To DeliveryWareHouseCenter -- Current Location is :"+location);
		
	}

}
