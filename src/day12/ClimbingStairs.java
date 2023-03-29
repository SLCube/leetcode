package day12;

public class ClimbingStairs {
    public static void main(String[] args) {
        ClimbingStairs climbingStairs = new ClimbingStairs();
        System.out.println("climbingStairs.climbStairs(30) = " + climbingStairs.climbStairs(5));
    }

    private int[] memory = new int[46];
    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }

        if (memory[n] != 0) {
            return memory[n];
        }
        return memory[n] = climbStairs(n - 1) + climbStairs(n - 2);
    }
}
