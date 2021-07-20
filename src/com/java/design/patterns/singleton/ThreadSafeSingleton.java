package com.java.design.patterns.singleton;

public class ThreadSafeSingleton {
	private static ThreadSafeSingleton threadSafeSingleton;
	
	private ThreadSafeSingleton() {
		// TODO Auto-generated constructor stub
	}

//	 public static synchronized ThreadSafeSingleton getThreadSafeSingleton() {
//		if(threadSafeSingleton != null) {
//			threadSafeSingleton = new ThreadSafeSingleton();
//		}	
//		return threadSafeSingleton;
//	}
	
	public static ThreadSafeSingleton getThreadSafeSingleton() {
		if(threadSafeSingleton != null) {
			synchronized (ThreadSafeSingleton.class) {
				if (threadSafeSingleton != null) {
					threadSafeSingleton = new ThreadSafeSingleton();
				}
			}
		}	
		return threadSafeSingleton;
	}

}
