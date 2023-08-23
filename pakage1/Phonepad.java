package pakage1;

import java.util.ArrayList;
import java.util.List;

public class Phonepad {
	public static void main(String[] args) {
		ArrayList<String>arrayList=phone2("", "12");
		System.out.println(arrayList);
	}
	static void phone(String p,String up) {
		if(up.isEmpty()) {
			System.out.println(p);
			return;
		}
		int digit = up.charAt(0)-'0';//this is make '2' to 2
		for(int i=(digit-1)*3;i<digit*3;i++) {
			char ch=(char)('a'+i);//type cast the next value in character 
			phone(p+ch,up.substring(1));
		}
	}
	static ArrayList<String> phone2(String p,String up) {
		if(up.isEmpty()) {
			ArrayList<String> list=new ArrayList<>();
			list.add(p);
			return list;
		}
	
		int digit = up.charAt(0)-'0';//this is make '2' to 2
		ArrayList<String>ans=new ArrayList<>();
		for(int i=(digit-1)*3;i<digit*3;i++) {
			char ch=(char)('a'+i);//type cast the next value in character 
			ans.addAll(phone2(p+ch,up.substring(1)));
		}
	
	return ans;

}
}
