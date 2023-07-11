import java.util.Arrays;

public class insertionsort {
    public static void main(String[] args) {
        int[]arr={-1,-223,1,4,2,6,5};
        sort(arr);
        System.out.println(Arrays.toString(arr));
        
    }
     static void swap(int[]arr,int first, int second){
        int temp=arr[second];
        arr[second]=arr[first];
        arr[first]=temp;

    }

    static void sort(int[]arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr, j-1, j);

                }
                else{
                    break;
                }
            }
        }
    }
    
}
