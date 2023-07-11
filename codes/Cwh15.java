package codes;
import java.util.Scanner;
public class Cwh15 {
	public static void main(String[] args) {
		//this is a leap year program
		System.out.println("enter the current year");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		
		if((year % 4==0)&& (year % 100!= 0) || (year%400 == 0)) {
			System.out.println("this is a leap year");
				
		}
		else {
			System.out.println("this is not a leap year");
		}
		
		
	}

}
