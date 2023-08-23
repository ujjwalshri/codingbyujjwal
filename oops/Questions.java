package oops;
abstract class pen{
	abstract void write();
    abstract void refill();
}
class fountain extends pen{

	@Override
	public void write() {
		// TODO Auto-generated method stub
		System.out.println("writing with the fountain pen");
		
	}

	@Override
	public void refill() {
		System.out.println("refilling the fountain pen");
		// TODO Auto-generated method stub
		
	}
	public void Nib() {
		System.out.println("this is the nib of the fountain pen nib  ");
	}
	
}

public class Questions {
	public static void main(String[] args) {
		
	}
	

}
