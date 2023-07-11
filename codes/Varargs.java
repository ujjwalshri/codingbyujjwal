package codes;

public class Varargs {
	static int add( int ...arr) {
		int result = 0;
		
		for (int a:arr) {
			result +=a;
			
		}
		return result;
		
	}
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		System.out.println("the addition of multiple numbers " +add(3,4,5,6,7,8,9));
		
		
	}

}
