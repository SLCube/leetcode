package algorithm1.day2;

import java.util.Arrays;

public class SquaresOfASortedArray {
    public static void main(String[] args) {
        int nums[] = {-4, -1, 0, 3, 10};
        int[] results = sortedSquares(nums);
        for (int result : results) {
            System.out.println("result = " + result);
        }
    }

    public static int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}
