package more_java_concepts;
import java.util.*;
import java.util.Set;
import java.util.List;

public class ArrayList {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Stack<String> l = new Stack<>();
		l.push("ujwL");
		l.push("this is a stack");
		l.push("this is not a stACK");
		System.out.println(l.peek());
		System.out.println("the required stack is:"+l);
		l.pop();
		System.out.println("now thw stack after poping is"+l);
		
		
		  System.out.println("this is a hashset program");
	       Set s = new LinkedHashSet();
	       s.add(10);
	       s.add(20);
	       System.out.println(s);
	       System.out.println("enter the elemnet you want to check");
	       int i = sc.nextInt(); 
	       if(s.contains(i)) {
	    	   System.out.println("this elemnet is present in the list");
	       }
	       else {
	    	   System.out.println("this element isn't availiable");
	       }
	        
		
	}

}
