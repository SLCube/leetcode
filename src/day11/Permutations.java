package day11;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static void main(String[] args) {
        Permutations permutations = new Permutations();
        permutations.permute(new int[]{1, 2, 3});
    }

    public List<List<Integer>> permute(int[] nums) {
        if (nums.length == 1) {
            return List.of(List.of(1));
        }

        List<List<Integer>> result = new ArrayList<>();
        backTracking(result, new ArrayList<>(), nums);

        return result;
    }

    private void backTracking(List<List<Integer>> result, List<Integer> sub, int[] nums) {
        if (sub.size() == nums.length) {
            result.add(new ArrayList<>(sub));
            return;
        }

        for (int num : nums) {
            if (sub.contains(num)) {
                sub.add(num);
                backTracking(result, sub, nums);
                sub.remove(sub.size() - 1);
            }
        }
    }
}
