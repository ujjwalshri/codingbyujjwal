package codes;

class methodoverloading{
	public void meth1(){
		System.out.println("this is meth 1");
		
	}
	public void meth1(int i) {
		System.out.println("i am overloaded method of meth1 taking "+i);
	}
}

public class Complex_num_addition {
	public static void main(String[] args) {
		methodoverloading m = new methodoverloading();
		m.meth1();
		m.meth1(4);
	}
	
}
