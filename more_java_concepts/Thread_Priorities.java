package more_java_concepts;
class mythr extends Thread{
	public mythr(String name) {
	super(name);
	}
	public void run() {
		while(true) {
		System.out.println("this is a thread named as "+this.getName());
		}
	}
}
public class Thread_Priorities {
	public static void main(String[] args) {
		mythr m = new mythr("ujjwal");
		mythr t = new mythr("ram cander");
		m.start();  
		t.start();
		System.out.println("the id of this thread is : "+ m.getId());//can excess id with this
		System.out.println("the name of the thread is : "+ m.getName());//can excess the name with this
		System.out.println("the id of this thread is : "+ t.getId());//can excess id with this
		System.out.println("the name of the thread is : "+ t.getName());//can excess the name with this
		
	}

}
