package algorithm1.day12;

public class HouseRobber {
    public static void main(String[] args) {
        HouseRobber houseRobber = new HouseRobber();
        System.out.println("houseRobber.rob(new int[]{1, 2, 3, 1}) = " + houseRobber.rob(new int[]{2, 7, 9, 3, 1}));

    }

    public int rob(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }

        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
        }

        return dp[nums.length - 1];
    }
}
