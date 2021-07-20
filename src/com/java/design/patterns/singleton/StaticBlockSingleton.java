package com.java.design.patterns.singleton;

public class StaticBlockSingleton {
	private static final StaticBlockSingleton instance;
	
	private StaticBlockSingleton() {
		// TODO Auto-generated constructor stub
	}
	
	static {
		try {
			instance = new StaticBlockSingleton();
			System.out.println("StaticBlockSingleton instance crated...");
		} catch (Exception e) {
			throw new RuntimeException("Exception occured in creating singleton instance");
		}
	}

	public static StaticBlockSingleton getInstance() {
		return instance;
	}	
}
