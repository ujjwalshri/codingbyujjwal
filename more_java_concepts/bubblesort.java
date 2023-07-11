package more_java_concepts;
import java.util.Arrays;


public class bubblesort {
	public static void main(String[] args) {
		 int[] nums={1,2,3,5};
	        sort(nums);
	        System.out.println(nums);

	}
	
	static void sort(int[]arr){
        
        
        for(int i=0;i<arr.length;i++){
        	//swap=false;
            
            for(int j=1;i<arr.length-i;j++){
            	
                if(arr[j]<arr[j-1]){
                    //swapp
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    //swap=true;
                }
                
            }
//            if(swap==false){
//                    break;
//                }
            
        }
    }
	

}
