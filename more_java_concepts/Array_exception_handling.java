package more_java_concepts;
import java.util.Scanner;
public class Array_exception_handling {
	
//	public int meth2(int num) {
//		if (num<0) {
//			throw new IllegalArgumentException("haha");
//		}
//		else {
//			return num;
//		}
//	}
	
	
	
	
	public  int meth1(int num) {
		int a=2;
		int b=0;
		if(b==0) {
			throw new ArithmeticException("hehe");
		}
		
		else {
			return a/b;
		}
	}
	public static void main(String[] args) {
	meth1();
	Array_exception_handling s = new Array_exception_handling();
	
		
		
	}
	

}
