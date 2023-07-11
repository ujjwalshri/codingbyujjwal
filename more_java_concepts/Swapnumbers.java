package more_java_concepts;

public class Swapnumbers {
	//java program to swapping the values in two integers
	public static void main(String[] args) {
		int a=10;
		int b=20;
		System.out.println("a is "+a+" b is "+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		
		System.out.println(" after swapping a is "+a+" after swapping b is "+b);
	}

}
