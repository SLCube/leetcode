package day3;

public class InputArrayIsSorted {

    public static void main(String[] args) {
        int[] numbers = {-1, -1, -1, -1, -1, -1, -1, 1, 1};
        int[] result = twoSum(numbers, 2);
        for (int i : result) {
            System.out.println("i = " + i);
        }
    }

    public static int[] twoSum(int[] numbers, int target) {
        int p1 = 0;
        int p2 = numbers.length - 1;

        while (p1 < p2) {
            int sum = numbers[p1] + numbers[p2];
            if (sum == target) {
                return new int[]{p1 + 1, p2 + 1};
            } else if (sum > target) {
                p2--;
            } else {
                p1++;
            }
        }
        return numbers;
    }
}
