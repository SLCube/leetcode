package algorithm2.day3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 15. 3Sum
 */
public class Q15 {

    public static void main(String[] args) {
        Q15 q15 = new Q15();
        List<List<Integer>> result = q15.threeSum(new int[]{-1, 0, 1, 2, -1, -4});
        System.out.println("result = " + result);
    }

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        Set<Integer> integerSet = new HashSet<>();

        for (int num : nums) {
            integerSet.add(num);
        }

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (integerSet.contains(nums[i]) || integerSet.contains(nums[j])) {
                    continue;
                }

                int sum = (nums[i] + nums[j]) * (-1);
                if (integerSet.contains(sum)) {
                    result.add(List.of(sum, nums[i], nums[j]));
                }
            }
        }

        return result;
    }
}
