package codes;
//one class can  be implemented by using two interfaces
interface bicycle{
	public void meth1();
	public void meth2();
	
}
interface motocycle{
	public int speed(int n);
	
	
}

class Avoncycle implements bicycle , motocycle{
	public void meth1() {
		System.out.println("poo poo");
	}
	public void meth2() {
		System.out.println("pee peee pee pee");
	}
	public int speed(int n) {
		System.out.println(n);
		return n;
	
	}
}
public class Interface {
	public static void main(String[] args) {
		Avoncycle cycle= new Avoncycle();
		cycle.meth1();
		cycle.meth2();
		cycle.speed(3);
	}

}
