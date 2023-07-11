package more_java_concepts;

public class Palindrome_string {
	public static void main(String[] args) {
		String s= "madam";
		StringBuilder str=new StringBuilder(s);
		String name =str.reverse().toString();
		if(s.equals(name)) {
			System.out.println("this is a palindrome");
		}
		else {
			System.out.println("this is not a palindrome program");
		}
		

	}
	
}
