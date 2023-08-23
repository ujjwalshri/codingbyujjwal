package pakage1;

import java.util.Arrays;

public class Merge_sort {

	public static void main(String[] args) {
		int []arr= {2,43,5,6,7,43,2};

	int []ans=merges(arr);
		System.out.println(Arrays.toString(ans));
	}
	static int[] merges(int[]arr) {
		if(arr.length==1) {
			return arr;
			
		}
		int mid = arr.length/2;
		int[]left= merges(Arrays.copyOfRange(arr, 0, mid));
		int []right= merges(Arrays.copyOfRange(arr,mid,arr.length));
		
		return merge(left,right);
	}
	private static int[] merge(int[] left, int[] right) {
		int i=0;
		int j=0; 
		int k=0;
		int[]mix= new int[left.length+right.length];
		while(i<left.length && j<right.length) {
			if(left[i]<right[j]) {
				mix[k]=left[i];
				k++;
				i++;
			}else {
				mix[k]=right[j];
				k++;
				j++;
			}
		}
		while(i<left.length) {
			mix[k]=left[i];
			k++;
			i++;
		}
		while(j<right.length) {
			mix[k]=right[j];
			k++;
			j++;
		}
			
		// TODO Auto-generated method stub
		return mix;
	}

}
