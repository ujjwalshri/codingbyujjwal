package more_java_concepts;
import java.util.Scanner;
public class Hackerrank {
	public static void main(String[] args) {
		   
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int []a=new int[n];
        for(int j = 0; j<a.length;j++){
            a[j] = scan.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        
	

	}
}
