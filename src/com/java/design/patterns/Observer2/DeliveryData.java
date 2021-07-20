package com.java.design.patterns.Observer2;

import java.util.ArrayList;
import java.util.List;

public class DeliveryData implements Subject{
	
	private List<Observer> observers;
	private String location;
	
	public DeliveryData() {
		this.observers = new ArrayList<>();
	}
	
	@Override
	public void register(Observer observer) {
		observers.add(observer);
		
	}

	@Override
	public void unRegister(Observer observer) {
		observers.remove(observer);
		
	}

	@Override
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(location);
		}	
	}
	
	public void locationChanged() {
		this.location=getLocation();
		notifyObservers();
	}

	public String getLocation() {
		return "YPlace";
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
}
