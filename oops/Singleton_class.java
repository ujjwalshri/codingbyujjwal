package oops;

import java.io.ObjectInputStream.GetField;

public class Singleton_class {
	private Singleton_class(){
		
	}
	 private static Singleton_class instance;
	public static  Singleton_class getInstance() {
		if(instance==null) {
			Singleton_class instaneClass = new Singleton_class();
		}
			
		
		
		return instance;
	}
		
	}

}

