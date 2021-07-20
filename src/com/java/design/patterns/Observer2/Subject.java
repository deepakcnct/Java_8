package com.java.design.patterns.Observer2;

public interface Subject {
	void register(Observer arg1);
	void unRegister(Observer arg1);
	void notifyObservers();
}
