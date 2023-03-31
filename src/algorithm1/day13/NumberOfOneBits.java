package algorithm1.day13;

public class NumberOfOneBits {
    public static void main(String[] args) {
        NumberOfOneBits numberOfOneBits = new NumberOfOneBits();
        System.out.println("numberOfOneBits.hammingWeight(10) = " + numberOfOneBits.hammingWeight(-3));
    }

    public int hammingWeight(int n) {
        int result = 0;
        while (n != 0) {
            result += n & 1;
            n = n >>> 1;
        }

        return result;
    }
}
