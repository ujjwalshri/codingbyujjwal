package more_java_concepts;

class mythread extends Thread{
	public void run() {
		try {
			Thread.sleep(100);
		}
		catch(Exception e){
			System.out.println(e);
			
		}
		while(true) {

			System.out.println("this is thread 1 welcome");
		}
		
		
	}
}
class mythread2 extends Thread{
	public void run() {
		try {
			Thread.sleep(100);
		}
		catch(Exception e){
			System.out.println(e);
			
		}
		
		while(true) {

			System.out.println("this is thread 2 thank you");
		}
		
		
	}
}


public class Practise_thread {
	public static void main(String[] args) {
		mythread m = new mythread();
		m.start();
		mythread2 m2 = new mythread2();
		m2.start();
		
	
		
	}

}
