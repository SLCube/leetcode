package day2;

import java.util.Arrays;

public class SquaresOfASortedArray {

    public static void main(String[] args) {
        int[] nums = {4, -1, 0, 3, 10};
        int[] result = sortedSquares(nums);

        for (int i : result) {
            System.out.println(i);
        }
    }

    public static int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];

        for(int i = 0;  i < result.length; i++) {
            result[i] = nums[i] * nums[i];
        }

        Arrays.sort(result);
        return result;
    }
}
