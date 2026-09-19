class Q1672{
    public static void main(String[] args) {
        int[][]  arr = {
            {2,4,6},
            {5,8,12}
        };

        System.out.println(maxWealth(arr));
    }

    static int maxWealth(int[][] arr){
        int ans = Integer.MIN_VALUE;
        for(int row = 0; row<arr.length; row ++){
            int sum = 0;
            for( int col = 0; col < arr[row].length; col ++){
                sum += arr[row][col];
            }
            if(sum > ans){
                ans = sum;
            }
        }
        return ans;
    }
}