import java.util.Collection;
import java.util.HashMap;
import java.util.*;
class arraylist{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("this is a arraylist program ");
        ArrayList<Integer> l = new ArrayList<>();
        
        l.add(1);
        l.add(2);
        l.add(67);
        int m=l.size();
        for(int i=0; i<=m-1;i++){
            System.out.println(l.get(0)+l.get(1));
            

        }
        System.out.println("the size of this array is:"+m);

       
    }
}