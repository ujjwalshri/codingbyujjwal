package more_java_concepts;

public class Notduplicate {
	public static void main(String[] args) {
		int[]arr= {1,2,3,4,5,2,3,1,4};
		System.out.println(notdup(arr));
	}
	public static int notdup(int[]arr) {
		int ans=0;
		for(int n:arr) {
			ans= ans^n;
		}
		return ans;
		
	}

}
