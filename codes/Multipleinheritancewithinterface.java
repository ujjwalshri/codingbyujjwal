package codes;

class cellphone{
	public void call() {
		System.out.println("calling..");
	}
	
}
interface media{
	String name="chll chaiya"; //this variable is final and cant be upadted afterwards
	public void video();
	
}
interface music{
public void song();
}
class  smartphone1 extends cellphone implements media,music{
	public void video() {
		System.out.println("playing the video");
	}
	public void song() {
		System.out.println("playing the music");
	}
}
class smartphone2 extends cellphone implements media , music{
	public void video() {
		System.out.println("playing video in sp 2");
	}
	public void song() {
		System.out.println("playing song in sp2");
	}
	
}


public class Multipleinheritancewithinterface {
	public static void main(String[] args) {
		smartphone1 samsung = new smartphone1(); //the object of smartphone1 by using multiple inheritance using interfaces
		samsung.call();
		samsung.video();
		samsung.song();
		smartphone2 nokia = new smartphone2(); //making the object of other class that also inherits the parent class and implements the function
		nokia.call();
		nokia.video();
		nokia.song();
		System.out.println(samsung.name);//calling the properties of the interface
		
			
	}

}
