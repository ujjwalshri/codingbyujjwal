package more_java_concepts;

public class HCF {
	public static void main(String[] args) {
		int a=5;
		int b=2;
		System.out.println("the hcfof these numbers is::"+hcf(a,b));
		System.out.println("the LCM OF these numbers is::"+lcm(a,b));
		
	}
	public static int hcf(int a, int b ) {
		if(a==0) {
			return b;
		}
		return hcf(b%a,a);
	}
	public static int lcm(int a, int b) {
		return a*b/hcf(a,b);
	}

}
