package day3;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);

        for (int num : nums) {
            System.out.println("num = " + num);
        }
    }

    public static void moveZeroes(int[] nums) {
        int[] temp = new int[nums.length];

        int p1 = 0;
        int p2 = nums.length - 1;

        for (int i = 0; i < temp.length; i++) {
            if (nums[i] == 0) {
                temp[p2] = nums[i];
                p2--;
            } else {
                temp[p1] = nums[i];
                p1++;
            }
        }

        for (int i = 0; i < temp.length; i++) {
            nums[i] = temp[i];
        }
    }
}
