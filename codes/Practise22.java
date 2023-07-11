package codes;
import java.util.Scanner;

public class Practise22 {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
            	String s1=sc.next();
            	System.out.print(s1);
               
            	   int x=sc.nextInt();
                   String str = String.format("%03d", x);
               System.out.print(str);
              

            }
            System.out.println("================================");

    }
}
