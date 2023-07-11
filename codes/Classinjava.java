package codes;
//creting our custom class in java
class employee1{
	int salary;
	int age;
	 String name;
	 //making a method in the class that returns a string value 
	 public void address() {
		 System.out.println("both have same address it is mumbai");
	 }
}









public class Classinjava {
public static void main(String[] args) {
	employee1 harry = new employee1();//makking a object of the class named as harry
	harry.salary= 10;
	harry.name = "harry";
	harry.address();
	System.out.println(harry.salary);
	System.out.println(harry.name);
	harry.address();
}
}

