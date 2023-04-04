package algorithm2.day2;

/**
 * 153. Find Minimum in Rotated Sorted Array
 */
public class Q153 {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            if (nums[left] > nums[right]) {
                left++;
            } else {
                return nums[left];
            }
        }

        return -1;
    }
}
