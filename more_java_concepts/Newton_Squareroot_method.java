package more_java_concepts;

public class Newton_Squareroot_method {
	public static void main(String[] args) {
		int n=6;
		System.out.println(sr(n));
		
	}
	public static double sr(double n) {
		double x=n;
		double root;
		while(true) {
			 root=  0.5 *(x+n/x);
			if(Math.abs(root-x)<1) {
				break;
			}
			x= root;
			
		}
		return root;
	}

}
