package oops;
interface animal{
	public void eat();
	public void sleep();
	}
class Monkey{
	public void jump() {
		System.out.println("this jumps");
	}
	public void bite() {
		System.out.println("this bite");
	}
	
}

class human extends Monkey implements animal{

	@Override
	public void jump() {
		// TODO Auto-generated method stub
		System.out.println("implementing again the methods of monkey class in the subclass");
	}

	@Override
	public void bite() {
		// TODO Auto-generated method stub
		System.out.println("implementing again the methods of monkey class in the subclass");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub\
		System.out.println("human eats");
		
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("human sleep ");
		
	}
	
}

public class Question2 {
	public static void main(String[] args) {
		
	}
	

}
