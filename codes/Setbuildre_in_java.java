package codes;
import java.util.Scanner;

public class Setbuildre_in_java {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string you want to check");
		String str = sc.next();
		
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		String reversedStr = sb.toString();
		if (reversedStr==str) {
			System.out.println("this String is a palindrome String");
		}
		else {
			System.out.println("this string is not a palindrome string");
		}
		

	}

}
