package more_java_concepts;

public class Squareroot {
	public static void main(String[] args) {
		int n=9;
		int p=2;
		System.out.printf("%3f",root(n,p));
		
		
	}
	public static double root(int n,int p) {
		
	
		 int s=0;
		 int e=n; 
		 double root=0.0;
		while(s<=e) {
			int mid=s+(e-s)/2;
			if(mid*mid ==n) {
				return mid;
			}if(mid*mid > n) {
				e=mid-1;
				
			}
			else {
				s=mid+1;
			}
			double increase = 0.1; 
			for(int i=0; i<n;i++) {
				
				while(root*root<=n) {
				root += increase;
					
				}
				root -= increase;
				increase /= 10;
			}
			return root;
		}
		return root;
	}
}


