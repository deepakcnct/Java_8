package com.java.design.patterns.Observer;

public abstract class Observer {
	
	protected Subject subject;
	protected abstract void update();
	
}
