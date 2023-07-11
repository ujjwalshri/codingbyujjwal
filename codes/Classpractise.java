package codes;

class employee{
	int salary;
	String name;
	public int getsalary() {
		return salary;
		
	}
	public void display() {
		System.out.println("this is A class");
	}
	public String name() {
		return name;
	}
	public String setname(String n) {
		return n;
	}
}
class employeee extends employee{
	public void display() {
		System.out.println("this is B class");
	}
	

	
}


public class Classpractise {
public static void main(String[] args) {
	employeee harry = new employeee();
	harry.display();
}
}
