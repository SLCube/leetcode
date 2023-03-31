package algorithm1.day14;

public class SingleNumber {
    public static void main(String[] args) {
        SingleNumber singleNumber = new SingleNumber();
        System.out.println("singleNumber.singleNumber(new int[]{2, 2, 1}) = " + singleNumber.singleNumber(new int[]{4, 2, 1, 2, 1}));
    }

    public int singleNumber(int[] nums) {
        if (nums.length == 1) return nums[0];

        int result = 0;

        for (int i = 0; i < nums.length; i++) {
            result ^= nums[i];
        }

        return result;
    }
}
