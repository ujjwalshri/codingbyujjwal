package oops;

public class Main {
	public static void main(String[] args) {
		///you can create as many references of an object of an singleton class but only one object 
		//will be created of the class which will be created due to get instance method present in the singleton_class
		Singleton_class singleton_class=Singleton_class.getInstance();
		Singleton_class singleton_class1=Singleton_class.getInstance();
		Singleton_class singleton_class2=Singleton_class.getInstance();
		Singleton_class singleton_class3=Singleton_class.getInstance();
		
	}

}
