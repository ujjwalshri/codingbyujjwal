package codes;
import java.util.Scanner;

/*abstract class pen{
	abstract public void write();
	abstract public void refill();
}
class fountainpen extends pen{
	public void write() {
		System.out.println("writng..");
	}
	public void refill() {
		System.out.println("refilling....");
	}
	public void changenib() {
		System.out.println("changing the nib of the pen");
	}
}*/

class monkey{
	public void jump() {
		System.out.println("monkey jumps");
	}
	public void bite() {
		System.out.println("monkey bites ");
	}
}

interface basicanimal{
	public void eat();
	public void sleep();
	
}

class human extends monkey implements basicanimal{
	public void eat() {
		System.out.println("human also eats");
	}
	public void sleep() {
		System.out.println("human also sleeps");
	}
	public void speaks() {
		System.out.println("human speaks too");
		
	}
}













public class Practise_interface {
	public static void main(String[] args) {
		/*System.out.println("what do you wanna do \n(1) write\n (2)refill ");
		Scanner sc = new Scanner(System.in);
		int num= sc.nextInt();
	
		fountainpen f = new fountainpen();
		if(num==1) {
			f.write();
		}
		else {
			f.refill();
		}
		*/
		
		human h = new human();
		h.bite();
		h.eat();
		h.sleep();
		h.speaks();
		h.jump();
		
		//demonstrating polymorphism in this program
		
		monkey m = new human();
		m.bite();
		m.jump();
		
		
		
		
		
		
		
	}

}
