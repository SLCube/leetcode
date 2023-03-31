package algorithm1.day14;

public class ReverseBits {
    public static void main(String[] args) {
        ReverseBits reverseBits = new ReverseBits();
        System.out.println("reverseBits.reverseBits(964176192) = " + reverseBits.reverseBits(10815399));
    }

    public int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result = result << 1;
            result += n % 2;
            n = n >>> 1;
        }

        return result;
    }
}
