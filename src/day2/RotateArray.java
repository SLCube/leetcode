package day2;

public class RotateArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        rotate(nums, 4);

        for (int num : nums) {
            System.out.println("num = " + num);
        }
    }

    public static void rotate(int[] nums, int k) {
        if (nums.length < k) {
            k = k % nums.length;
        }
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    public static void reverse(int[] nums, int left, int right) {
        while (left <= right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}
