package codes;

public class RECURSION {
	static int fact(int n) {
		if (n==0 || n==1) {
			return 1;
		}
		else {
			 return n*fact(n-1);
		}
		
	}
	
	public static void main(String[] args) {
		System.out.println("the factoriaal of the value is "+fact(4));
	}

}
