package algorithm1.day3;

public class MoveZeros {
    public static void main(String[] args) {
        int[] nums = {1, 0};
        moveZeros(nums);

        for (int num : nums) {
            System.out.println("num = " + num);
        }
    }

    public static void moveZeros(int[] nums) {
        if (nums == null || nums.length == 1) {
            return;
        }

        int zeroPointer = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[zeroPointer];
                nums[zeroPointer] = nums[i];
                nums[i] = temp;
                zeroPointer++;
            }
        }
    }
}
