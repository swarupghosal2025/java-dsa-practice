import java.util.Arrays;

public class Search_In_2DArray {
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3,4},
            {4,5,6,8,10},
            {45,788,221,97}
        };

        int target = 8;
        int[] result = newArr(arr, target);
        System.out.println(Arrays.toString(result));
    }

    static int[] newArr(int[][] arr, int target){
        for(int row = 0;row < arr.length; row ++){
            for(int col = 0; col < arr[row].length; col ++){
                if(arr[row][col] == target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
