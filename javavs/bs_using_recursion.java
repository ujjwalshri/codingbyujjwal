public class bs_using_recursion {
    public static void main(String[] args) {
        int []arr = {1,2,3,4,6,7,8,88,99};
		int target=4;
        int n=arr.length-1;
		int ans=binarys(arr,target,0,n);
        System.out.println(ans);
        
    }
    static int binarys(int[]arr,int target,int s, int e) {
		
	
		if(s>e) {
			return -1;	
	}
         int mid = s+(e-s)/2;
		if(arr[mid]==target) {
			return mid;
		}
		if(target<arr[mid]) {
			 return binarys(arr,target,s,mid-1);
		}else {
			return binarys(arr,target,mid+1,e);
		}

		
}

    
}
