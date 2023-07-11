package more_java_concepts;

public class Factors_of_num {
	public static void main(String[] args) {
		int n=20;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				System.out.print(i+" ");
			}
		}
		
	}


}
