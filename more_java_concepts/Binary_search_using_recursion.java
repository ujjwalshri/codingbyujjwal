package more_java_concepts;

public class Binary_search_using_recursion {
	public static void main(String[] args) {
		int []arr = {1,2,3,4,6,7,8,88,99};
		int target=4;
		int ans=binarys(arr,target,0,arr.length-1);
		
		
	}
	static int binarys(int[]arr,int target,int s, int e) {
		int mid = s+(e-s)/2;
	
		if(s>e) {
			return -1;	
	}
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
