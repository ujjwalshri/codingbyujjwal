package more_java_concepts;
import java.util.Scanner;
//java program to check if a string is palindrome or not

class solution{
	public boolean ispalindrome(String word) {
		String rev="";// take a String which is empty
		boolean ans = false;//take a boolean variable and intialize it to false
		
		for (int i=word.length()-1;i>=0;i--) {
			rev = rev+word.charAt(i);
			
		}
		if(rev.equals(word)) {//checks if the new rev is equal to the original word not
		 ans = true;
		}
		
		return ans;//returns ans
		
		
	}
	
}




public class String_palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string you want to check");
		solution s = new solution();
		String word = sc.next();
		boolean a = s.ispalindrome(word);//gives the return value of ispalindrome function to variable a
		if (a==true) {
			System.out.println("this is a palindrome string");
		}
		else {
			System.out.println("this is not a palindrome string");
		}
		
	
	}
	

}
