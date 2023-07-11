import java.util.*;
public class Linear {
    static int linear(int[]arr,int target){
        if(arr.length==0){
            return -1;
        }
        for(int i=0;i<arr.length;i++){
            int element=arr[i];
            if(element==target){
                return i;
            }
        }
        return -1;
    }











    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []a={1,2,4,5,6,7,8};
        System.out.print("enter the number you want to check in the array ::");
        int t=sc.nextInt();
        int ans=linear(a, t);
        System.out.println(ans);


        
    }
}
