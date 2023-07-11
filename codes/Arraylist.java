package codes;
import java.util.ArrayList;

public class Arraylist {
	public static void main(String[] args) {
		ArrayList<Integer> numbers=new ArrayList<>();
		numbers.add(10);
		numbers.add(20);
		System.out.println("element at index 0:"+numbers.get(0));
		System.out.println("element at index 1:"+numbers.get(1));
		
		System.out.println("itrating over th earray list:");
		for (int i=0;i<numbers.size();i++) {
			System.out.println(numbers.get(i)+"");
		}
	System.out.println();
		
		numbers	.remove(1);
		System.out.println("ARRAY AFTER REMOVING ELEMENNT AT INDEX 1:");
		System.out.println(numbers);
	
		
		
		
		
		
		
	}

}
