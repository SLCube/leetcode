package day11;

import java.util.ArrayList;
import java.util.List;

public class Combinations {
    public static void main(String[] args) {
        Combinations combinations = new Combinations();
        combinations.combine(4, 2);
    }

    public List<List<Integer>> combine(int n, int k) {
        if (n == 1) {
            return List.of(List.of(1));
        }

        List<List<Integer>> result = new ArrayList<>();
        backTracking(result, new ArrayList<>(), 1, n, k);

        return result;
    }

    private void backTracking(List<List<Integer>> result, List<Integer> sub, int start, int n, int k) {
        if (sub.size() == k) {
            result.add(new ArrayList<>(sub));
            return;
        }

        for (int i = start; i <= n ; i++) {
            sub.add(i);
            backTracking(result, sub, i + 1, n, k);
            sub.remove(sub.size() - 1);
        }
    }
}
