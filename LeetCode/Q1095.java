public class Q1095 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1};
        int target = 3;
        System.out.println(search(arr, target));
    }

    
    static int search(int[] arr, int target){
        int peak = findPeakElement(arr);
        int firstTry = orderAgnosticBinarySearch(arr, target,0,peak);
        if(firstTry != -1){
            return firstTry;
        }
        else{
            return orderAgnosticBinarySearch(arr, target, peak+1, arr.length-1);
        }
    }



    static int findPeakElement(int[] nums) {
        int start = 0;
        int end = nums.length -1;

        while (start < end) {
            int mid = start + (end - start)/2;

            if (nums[mid] > nums[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }


    static int orderAgnosticBinarySearch(int[] arr, int target, int start, int end) {

        boolean isAscending = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if(arr[mid] == target){
                return mid;
            }

            if (isAscending) {
                if (target < arr[mid]) {
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
            else{
                if(target < arr[mid]){
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}

// this my code, this code is a working code but not a optimised code...
// public class Q1095 {
// public static void main(String[] args) {
// int[] arr = {1,2,3,4,5,3,1};
// int target = 3;
// System.out.println(findTargetElement(arr, target));
// }

// static int findTargetElement(int[] nums, int target){
// int peak = findPeakElement(nums);
// int newAns = 0;
// int ans = 0;
// int start = 0;
// int end = 0;
// if(target == nums[peak]){
// ans = peak;
// int newStart = 0;
// int newEnd = peak - 1;

// while (newStart <= newEnd) {
// int mid = newStart + (newEnd - newStart) / 2;

// if (target < nums[mid]) {
// newEnd = mid - 1;
// } else if (target > nums[mid]) {
// newStart = mid + 1;
// } else {
// return mid;
// }
// }
// }
// else if(target < peak){
// end = peak - 1;
// }
// else{
// start = peak;
// end = nums.length - 1;
// }
// while (start <= end) {
// int mid = start + (end - start) / 2;

// if (target < nums[mid]) {
// end = mid - 1;
// } else if (target > nums[mid]) {
// start = mid + 1;
// } else {
// return mid;
// }
// }
// return -1;
// }

// static int findPeakElement(int[] nums) {
// int start = 0;
// int end = nums.length -1;

// while (start < end) {
// int mid = start + (end - start)/2;

// if (nums[mid] > nums[mid + 1]) {
// end = mid;
// } else {
// start = mid + 1;
// }
// }
// //System.out.println(start);
// return start;
// }
// }
