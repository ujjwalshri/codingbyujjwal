package pakage1;

import java.util.ArrayList;
import java.util.List;

public class Hello_world {
	public static void main(String[] args) {
		List<String> a =  permut2("", "abc");
		System.out.println(a);
		
		
	}
    static void permut(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char c=up.charAt(0);

        for(int i=0;i<=p.length(); i++){
            String f=p.substring(0,i);
            String s= p.substring(i,p.length());
            permut(f+c+s,up.substring(1));

        }
        
}
    static List<String> permut2(String p, String up){
        if(up.isEmpty()){
           
        	List<String>list= new ArrayList<>();
        	list.add(p);
            return list;
        }
        char c=up.charAt(0);
        List<String> ans= new ArrayList<>();

        for(int i=0;i<=p.length(); i++){
            String f=p.substring(0,i);
            String s= p.substring(i,p.length());
           ans.addAll( permut2(f+c+s,up.substring(1)));

        }
        return ans;
}
}
