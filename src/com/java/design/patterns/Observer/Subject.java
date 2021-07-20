package com.java.design.patterns.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @apiNote Subject is an Object having methods to attach and detach observers to a client object.
 * @author Deepak
 *
 */
public class Subject {
	private List<Observer> observers = new ArrayList<>();
	private int state;
	
	public List<Observer> getObservers() {
		return observers;
	}
	public void setObservers(List<Observer> observers) {
		this.observers = observers;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	
	public void attach(Observer observer) {
		observers.add(observer);
	}
	
	public void notifyAllObservers() {
		for (Observer observer : observers) {
			observer.update();
		}
	}
	
}
