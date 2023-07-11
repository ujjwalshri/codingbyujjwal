package codes;
import java.util.Scanner;
import java.util.Random;
import java.util.Random.*;
public class ROCKPAPERSCISORS {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter  0 for rocks and 1 for paper and 2 for scissors  ");
		int ui = sc.nextInt();
		
		Random random  = new Random();
		int ci = random.nextInt(3);
		
		if (ui==ci) {
			System.out.println("draw");
			
		}
		else if(ui==0 && ci ==2 || ui==1 && ci==0 || ui==2 && ci==1  ) {
			System.out.println("you win ");
		}
		else {
			System.out.println("you lost");
			
		}
		System.out.println("computer choice ="+ci);
		
	}


}
