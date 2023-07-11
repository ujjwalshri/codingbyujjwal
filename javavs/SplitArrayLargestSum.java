public class SplitArrayLargestSum {
    public static void main(String[] args) {
        
    }
    public int splitArray(int[] nums, int k) {
        int start=0;
        int end=0;
        
        for(int i=0;i<nums.length;i++){
            start=Math.max(start, nums[i]);//this loop will contain the max item from the array
            end +=nums[i];

        }
        while(start<end){
             
            int mid = start+(end-start)/2;
            //calculate ho wmany pieces you can divide this max sum
            int sum=0;
            int pieces=1;
            for(int num:nums){
                if(sum+num >mid){
                     //you cannot add this is this subarray,make new one
                     sum=num;
                     pieces++;  
                }else{
                     sum += num;
                }
            }
            if(pieces>k ){
                start=mid+1;
            }else{
                end=mid;
            } 


        }
        return end;//since end==start at the end pof ths function so we can retrun any one of them
    }
    
}
