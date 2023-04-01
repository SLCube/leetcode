package algorithm2.day1;

import java.util.Arrays;

/**
 * 33. Search in Rotated Sorted Array
 */
public class Q33 {

    public int search(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }

        return -1;
    }
}
