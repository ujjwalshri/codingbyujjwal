package codes;

public class Cwh14 {
	public static void main(String[] args) {
		
		String nontrimstring = "      hearry      ";
		String name = "HarrY";
		String letter = "dear ujjwal thanks a lot";
		String mystring = "this string contains double and tripllee  spaces";
		System.out.println(name.replace("r","p"));
		System.out.println(name.startsWith("Ha"));
		System.out.println(name.endsWith("ry"));
		System.out.println(name.lastIndexOf("ar"));
		System.out.println(name.equalsIgnoreCase("harry"));
		System.out.println(name.equals("harry"));
		System.out.println(nontrimstring.replace(" ", "_"));
		System.out.println(letter.replace("ujjwal", "shivank"));
		System.out.println(mystring.indexOf("  "));
		System.out.println(mystring.indexOf("   "));
		
		
		
	}

}
