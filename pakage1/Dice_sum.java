package pakage1;

import java.util.ArrayList;

public class Dice_sum {
	public static void main(String[] args) {
		ArrayList<String>anStrings=dice2("", 4,8);
		System.out.println(anStrings);
	}
	static ArrayList<String> dice(String p, int target) {
		if(target==0) {
			ArrayList<String> list=new ArrayList<>();
			list.add(p);
			return list;
			
		}
		ArrayList<String>list= new ArrayList<>();
		for(int i=1; i<=6 && i<=target;i++) {
		list.addAll(dice(p+i, target-i));
		}
		
	
	return list;
}
	static ArrayList<String> dice2(String p, int target,int face) {
		if(target==0) {
			ArrayList<String> list=new ArrayList<>();
			list.add(p);
			return list;
			
		}
		ArrayList<String>list= new ArrayList<>();
		for(int i=1; i<=face && i<=target;i++) {
		list.addAll(dice2(p+i, target-i,face));
		}
		
	
	return list;
}

}
