package codes;
 import java.util.ArrayList;
public class Arraylist2 {
	public static void main(String[] args) {
		ArrayList<Integer> details = new ArrayList<>();
		details.add(69);
		details.add(699);
		details.add(0000);
		details.add(0,99);
		for (int i=0;i<details.size();i++){
			System.out.println(details.get(i)+"");
		}
		System.out.println();
	
		
		System.out.print(details);
	}

}
