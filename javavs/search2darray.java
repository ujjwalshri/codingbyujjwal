import java.lang.reflect.Array;

public class search2darray {
    static Array search2d(int[][]arr,int target){
        if(arr.length==0){
            return int[] c={-1,-1};
        }
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]==target){
                    int[] b={row,col};
                    return b;
                }
            }

        }
        return -1 -1;

    }











    public static void main(String[] args) {
        int [][]a={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int target=6;
        int ans=search2d(a, target);
        System.out.println(ans);
    }
}
