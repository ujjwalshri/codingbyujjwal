package more_java_concepts;

public class Fibonacci {
	public static void main(String[] args) {
//		for(int i=0;i<=10;i++) {
//			System.out.print(fib(i)+" ");
//		}
		System.out.println(fibonacci(50));
		
	}
//	static double fibonacci(int n) {
//		return (int)Math.pow(((1+Math.sqrt(5)) / 2 , n)/Math.sqrt(5));
//	}
	
	
	static int fib(int n) {
		if(n<2) {
			return n;
		}
		
		
		return fib(n-1)+fib(n-2);
	}


}
