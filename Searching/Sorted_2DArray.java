import java.util.Arrays;

public class Sorted_2DArray {
    public static void main(String[] args) {
        int[][] arr = {
            {2,4,6,9},
            {3,5,8,11},
            {5,7,12,17},
            {9,13,18,32}
        };
        int target = 8;
        System.out.println(Arrays.toString(searchIn2DSortedArray(arr, target)));
    }

    static int[] searchIn2DSortedArray(int[][] arr, int target){
        
        int row = 0;
        int col = arr.length - 1;


        while(row < arr.length && col >= 0){

            if(target == arr[row][col])
                return new int[]{row,col};

            if(target > arr[row][col])
                row++;

            else{
                col--;
            }
        }
        return new int[]{-1,-1};
    }
}
