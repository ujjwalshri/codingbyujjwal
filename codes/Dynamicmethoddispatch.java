package codes;


class phone{
	public void greet(){
		System.out.println("hi good morning");
	}

public void name(){
	System.out.println(" hi my name is java");
}
}
class smartphone extends phone{
	public void music() {
		System.out.println("playing musing");
	}
	public void name(){
		System.out.println(" hi my name is java in smartphone");
	}
}
public class Dynamicmethoddispatch {
	public static void main(String[] args) {
		phone obj = new smartphone();
		obj.greet();
		obj.name();
	//	obj.music(); (this is not allowed in java)
		
		
	}

}
