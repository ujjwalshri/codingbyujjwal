import java.util.Scanner;
public class orderagnostic {
     static int binarys(int[]arr,int target){
        int start=0;
        int end=arr.length-1;
        
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else{
                return mid;
            }
            
        }
        return -1;
    }
     static int binarys2(int[]arr,int target){
        int start=0;
        int end=arr.length-1;
        
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target>arr[mid]){
                end=mid-1;
            }
            else if(target<arr[mid]){
                start=mid+1;
            }
            else{
                return mid;
            }
            
        }
        return -1;
    }
    public static void main(String[] args) {
        int[]arr=new int[5];
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            System.out.print(
                "enter the elemnet in the arry in sorted fasion"
            );
            arr[i]=sc.nextInt();
        }

        int end=arr.length-1;
        System.out.println("enter the element you wwant to search");
        int target=sc.nextInt();
        if(arr[0]>arr[end]){
            int ans=binarys2(arr, target);
            System.out.println(ans);
        }
        else{
            int ans=binarys(arr, target);
            System.out.println(ans);
        }
        
        
    }
    
}
