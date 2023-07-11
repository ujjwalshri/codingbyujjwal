package codes;

public class Adding_array {
	public static void main(String[] args) {
	
		int a[]= {1,2,3,4,5};
		int b[]= {1,2,3,4,5};
		int c[] = new int[a.length];
		if(a.length==b.length) {
			
			for(int i=0,j=0,k=0;i<a.length;i++,j++,k++) {
				c[k]=a[i]+b[j];
				
				
			}
			System.out.println("the resultant array is");
			System.out.print("{");
			for(int e:c) {
				
				;System.out.print(e+",");

				
			}
			System.out.print("}");
			
		}
	}
}
