package oops;
class Telephone{
	public void call() {
		System.out.println("this is a the super class");
	}
	public void lift() {
		System.out.println("this is also super class method");
	}
	public void disconnected() {
		System.out.println("this is the disconnexted method");
	}
}
class Smart_telephone extends Telephone{

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("this is in the sub class");
	}

	@Override
	public void lift() {
		// TODO Auto-generated method stub
		System.out.println("this is in the sub class");
	}

	@Override
	public void disconnected() {
		// TODO Auto-generated method stub
		System.out.println("this is in the sub class");
	}
	
	
}
public class Question3 {
	public static void main(String[] args) {
		
		
	}

}
