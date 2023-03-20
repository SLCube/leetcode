package day3;

public class TwoSum2 {
    public static void main(String[] args) {
        int[] nums = {5, 25, 75};
        int[] ints = twoSum(nums, 100);
        for (int anInt : ints) {

        }

    }

    public static int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];

        int left = 0;
        int right = numbers.length - 1;

        while (left <= right) {
            if (numbers[left] + numbers[right] > target) {
                right--;
            } else if (numbers[left] + numbers[right] < target) {
                left++;
            } else {
                result[0] = left + 1;
                result[1] = right + 1;
                break;
            }
        }

        return result;
    }
}
