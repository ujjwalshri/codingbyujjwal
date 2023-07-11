package codes;
import java.util.Random;
import java.util.Scanner;
/*create a class game to allow the useer to guess the number game should have following methods
 
 */
class game{
	public int number;
	public int numberofguess;
	public int inputnumber;

	game(){
		Random rand = new Random();
		this.number = rand.nextInt(100);
	}
	void takeuserinput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("guess the number");
		inputnumber = sc.nextInt();
	}
	boolean iscorrectnumber() {
		numberofguess++;
		if (inputnumber==number) {
			System.out.format("you have won the game computer generated number was %d \n" , number);
			return true;
		}else if(inputnumber>number) {
			System.out.println("this number is too high");
		}
		else if(inputnumber<number) {
			System.out.println("this number is too low");
		}
		return false;
		
		
	}
}
 class Guessthenumber {
	 public static void main(String[] args) {
		game g = new game();
		boolean b= false;
		while(!b) {
			g.takeuserinput();
			g.iscorrectnumber();

		}
				
	}

}
