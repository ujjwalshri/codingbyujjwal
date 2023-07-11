package more_java_concepts;
import java.util.*;
//program to check if a number is palindrome or not
public class Qb_65 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number you want check if it palindrome or not ::  ");
		int n = sc.nextInt();
		int sum=0; int r;
		int temp = n;
		
		while(n>0) {
			r = n%10;
			sum = (sum*10)+r;
			n= n/10;
			
			
}
		if(temp==sum) {
			System.out.println("this is palindrome");
		}
		else {
			System.out.println("this is not plindrome");
		}
		
		
		
}
	

}
