public class RBS {
    public static void main(String[] args) {
        int []nums={4,5,6,7,0,1,2};
        int ans=findPivot(arr);
        System.out.println(ans);
        
    }
        public int search(int[] nums, int target) {
            
            int pivot=findPivot(nums);
            //if you dont find the pivot that meawns the pivot is not present that means the array is not rotated
            if(pivot==-1){
                //do simpple binary search if pivot is not present
                return binarys(nums, target, 0, nums.length-1);
            }if(nums[pivot]==target){
                return pivot;
            }if(target>=nums[0]){
                return binarys(nums, target, 0, pivot-1);

            }else{
                return binarys(nums, target, pivot+1, nums.length-1);
            }

        
        
    }







    static int binarys(int[]nums,int target,int start,int end){
        // int start=0;
        // int end=nums.length-1;
        
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<nums[mid]){
                end=mid-1;
            }
            else if(target>nums[mid]){
                start=mid+1;
            }
            else{
                return mid;
            }
            
        }
        return -1;
    }



    
    static int findPivot(int[]arr){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }if( start>mid &&   arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[start]<=arr[mid]){
                end=mid-1;
            }else{
                start=mid+1;
            }

        }
        return -1;
    }
    
}
