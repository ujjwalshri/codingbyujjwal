package codes;

interface dad{
	void meth1();
	void meth2();
}

interface son extends dad{
	void meth3();
	void meth4();
}
class sister implements son{
	public void meth1(){
		System.out.println("this is a meth1");
	}
	public void meth2() {
		System.out.println("this is meth 2");
	}
	public void meth3() {
		System.out.println("this is meth 3");
	}
	public void meth4() {
		System.out.println("this is meth 4");
	}
	
}
public class Interfaces_in_java {
	public static void main(String[] args) {
		sister obj = new sister();
		obj.meth1();
		obj.meth2();
		obj.meth3();
		obj.meth4();
	}

}
