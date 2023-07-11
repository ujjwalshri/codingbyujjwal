public class ceiling {
     
    static int ceiling(char[]letters,char target){
        int start=0;
        int end=letters.length-1;
        
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<letters[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }

        }
        return letters[start%letters.length];
    }
     public static void main(String[] args) {
        int[] arr={1,2,3,14,16,18};
        int target=15;
        int ans=ceiling(arr, target);
        System.out.println(ans);
    }


    
}
