package more_java_concepts;

public class Practise2 {
	public static void main(String[] args) {
		int a=67;
		System.out.println(is0dd(a));
		
	}
	public static boolean is0dd(int a) {
		return (a & 1)==1;
		
	}

}
