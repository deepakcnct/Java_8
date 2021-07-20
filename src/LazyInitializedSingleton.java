
public class LazyInitializedSingleton {
	private static LazyInitializedSingleton instance;
	
	
	private LazyInitializedSingleton() {
		
		// TODO Auto-generated constructor stub
	}

	public static LazyInitializedSingleton getInstance() {
		
		if (instance != null) {
			instance = new LazyInitializedSingleton();
		}
		return instance;
	}
	
	
	
}
