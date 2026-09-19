public class Strictly_Sorted_2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };
        int target = 16;

        int result = binarySearch(arr, target);
        if (result != -1) {
            int row = result / arr[0].length;
            int col = result % arr[0].length;
            System.out.println("Find at Row " + (row + 1) + " Column " + (col + 1));
        } else {
            System.out.println("Item Not Found");
        }
    }

    static int binarySearch(int[][] arr, int target) {

        int rows = arr.length;
        int cols = arr[0].length;

        int start = 0;
        int end = rows * cols - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            int row = mid / cols;
            int col = mid % cols;

            if (arr[row][col] == target) {
                return mid;
            }
            if (arr[row][col] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
