package codes;

public class Methodpractise {
	//printing a table
	static void table(int a) {
		for (int i=1; i<=10;i++) {
			System.out.format("%d x %d =%d\n",a,i,a*i);
		}
	}
	//printing the sum of first n natural numbers
	
	static int sumrec(int n) {
		if (n==1) {
			return 1;
		}
		else {
			return n + sumrec(n-1);
		}
	}
	//printing nth term of fibonaccii series
	static int fib(int n) {
		if (n==1) {
			return 0;
		}
		else if (n==2) {
			return 1;
		}
		else {
			return fib(n-1)+fib(n-2);
		}
	}
	
	//print the average of numbers passed as an argument 
	
	static float average(float...arr) {
		float c = arr.length;
		 float result = 0;
		for (float a:arr) {
			result = result +a;
			
			
		}
		float d = result/c;
		return d;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		//System.out.println(sumrec(2));
		//table(6);
		//System.out.println(fib(5));
		System.out.print(average(2,3,4,5));
	}
	
	
	
	
	
	
	
	
	
	
	

}
