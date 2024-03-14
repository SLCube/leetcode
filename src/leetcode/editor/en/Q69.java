package leetcode.editor.en;

public class Q69 {

    public int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }

        if (x == 1) {
            return 1;
        }

        for (long i = 1; i <= x; i++) {
            long multiple = i * i;
            if (multiple > x) {
                return (int) i - 1;
            }
        }

        return -1;
    }


    public static void main(String[] args) {
        Q69 solution = new Q69();
        int result1 = solution.mySqrt(2147395600);
        System.out.println("result1 = " + result1);
    }
}
