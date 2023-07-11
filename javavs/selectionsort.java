import java.util.Arrays;

public class selectionsort {
    public static void main(String[] args) {
        int[]arr={1,5,3,-1,2,4,7,99,99};
        sort(arr);
        System.out.println(Arrays.toString(arr));
        
        
    }
    static void sort(int []arr){
        //this is the sorting function 
        for(int i=0; i<arr.length;i++){
            int last=arr.length-i-1;
            int max=max(arr, 0, last);//this function will return the max value with in the array
            swap(arr, last, max);//this will swap the max value with the last value
        }
    }
    static void swap(int[]arr,int first, int second){
        int temp=arr[second];
        arr[second]=arr[first];
        arr[first]=temp;

    }



    static int max(int[]arr,int start,int end){
        
        for(int i=start; i<=end;i++){
            if (arr[start]<arr[i]){
                start=i;
            }
        }
        return start;//this will retrun the max value between the array
        


    }
    
}
