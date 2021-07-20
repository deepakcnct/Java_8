package com.java.design.patterns.singleton;

/**
 * @apiNote These type of class have only single instance throughout.
 *  example :- logging, caching, driver class such as DB driver, thread pool.
 *  
 *  1. Private Constructor to restrict instantiation of the class from outside.
 *  2. Private instance variable, which serves as the only instance of the class.
 *  3. Public static method, that returns the instance of the class. It serves as the global access point from outside world to the instance of this class.
 * 
 * 	Different approaches of Singleton class :-
 * 	1. Eager 2. Lazy 3. Static block 4. Thread Safe Singleton 5. Using Reflection to destroy Singleton class 6. Enum 7. Bill Pugh Singleton implementation 8. Serialization and Singleton.
 * 
 * @author Deepak
 * 
 *
 */

public class EagerInitializedSingleton {
	public static final EagerInitializedSingleton eagerInitializedSingleton = new EagerInitializedSingleton();

	//private constructor to avoid client applications to use constructor
	private EagerInitializedSingleton() {
		// TODO Auto-generated constructor stub
	}

	public static EagerInitializedSingleton getEagerinitializedsingleton() {
		return eagerInitializedSingleton;
	}

}
