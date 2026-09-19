//Given an array of integers, return how many of them contain an even number.


class Q1295{
    public static void main(String[] args) {
        int[] arr = {12,345,2,6,7896};
        System.out.println(findNumbers(arr));
    }

    static int findNumbers(int[] nums){
        int count = 0;
        for(int num : nums){
            if(isEven(num)){
                count++;
            }
        }
        return count;
    }

    static boolean isEven(int num){
        if(noOfDigits(num) % 2 == 0){
            return true;
        }
        return false;
    }

    static int noOfDigits(int num){
        return (int)(Math.log10(num) + 1);
    }
}