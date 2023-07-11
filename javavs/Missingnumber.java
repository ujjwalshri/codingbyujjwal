import java.util.Arrays;

public class Missingnumber {
    public static void main(String[] args) {
        int[] arr={4,3,2,7,8,2,3,1};
        int[]ans=cyclesort(arr);
        System.out.println(Arrays.toString());
        System.out.println("this is a cofde  for the ");

       
    }
    static int[] cyclesort(int[]arr){
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;//if we include 0 to the array thay means the array will be 0 to n thats why we will check the index the place of the element
            //if element = index then skip or else swap
            if(arr[i]<arr.length && arr[correct]!= arr[i]){//this mean if the element that we want to check only if it is less than n then only 
                //run the loop otherwise go in the else part of the code
                swap(arr, i,correct);
                
            }
            else{
                i++;
            }
        }
         for(int j=0; j<arr.length;j++){
                if(arr[j]!=j){
                    return new int []{j};
                }
            }
        return new int[]{arr.length};
    }
    static void  swap(int[] arr, int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;

    }
    
}
