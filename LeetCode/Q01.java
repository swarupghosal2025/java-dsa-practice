//Two Sum

import java.util.Arrays;

public class Q01{
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 9;
        int[] ans = twoSum(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] twoSum(int[] nums, int target){
        for(int i = 0; i<nums.length; i ++){
            for(int j =0; j<nums.length; j++){
                if(j == i)
                    continue;
                if(target == (nums[i] + nums[j]))
                    return new int[]{i,j};
            }
        }
        return new int[]{-1,-1};
    }
}