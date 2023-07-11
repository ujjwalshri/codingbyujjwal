public class 2Darray_BS {
    public static void main(String[] args) {
        int[][]arr={
            {1,2,3},
            {4,5,6},
            {7,8,9}


        };
        System.out.print(Arrays.toString(search(arr,6)));
        
    }

    static int[] search(int[][]matrix,int target){
        int c=0;
        int r=matrix.length-1;
        while(c=0 && r<matrix.length){
            if(matrix[r][c]==target){
                return new int[]{r,c};
            }
            if(target>matrix[r][c]){
                c--;
            }else{
                r++;
            }
        }
        return new int[]{-1,-1};
        
    }


    
}
