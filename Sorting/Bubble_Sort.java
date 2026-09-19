import java.util.Arrays;

public class Bubble_Sort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 1, 2};
        bubbleSorting(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void bubbleSorting(int[] arr) {
        boolean isSwapped;
        for (int i = 0; i < arr.length-1; i++) {
            isSwapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    isSwapped = true;
                }
            }
            if(!isSwapped){
                break;
            }
        }
    }

}
