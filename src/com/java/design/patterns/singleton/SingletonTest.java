package com.java.design.patterns.singleton;

public class SingletonTest {
	public static void main(String[] args) {
		System.out.println(StaticBlockSingleton.getInstance());
		
		System.out.println(EagerInitializedSingleton.getEagerinitializedsingleton());
	}
}
