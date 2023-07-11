package more_java_concepts;
import java.util.Scanner;
class anshika1{
	public void call1() {
		System.out.println("calling anshika..");
	}
	public void call2() {
		System.out.println("calling ujjwal..");
	}
}

public class Program {
	public static void main(String[] args) {
		anshika1 a = new anshika1();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("WHOME DO YOU WANNA CALL??");
		System.out.println("1.anshika 2.ujjwal");
		int b = sc.nextInt();
		if(b==1) {
			a.call1();
		}
		else {
			a.call2();
		}

		
	
	
	}

}
