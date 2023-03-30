package day13;

public class PowerOfTwo {
    public static void main(String[] args) {
        PowerOfTwo powerOfTwo = new PowerOfTwo();
//        System.out.println("powerOfTwo.isPowerOfTwo(1) = " + powerOfTwo.isPowerOfTwo(1));
//        System.out.println("powerOfTwo.isPowerOfTwo(16) = " + powerOfTwo.isPowerOfTwo(16));
//        System.out.println("powerOfTwo.isPowerOfTwo(3) = " + powerOfTwo.isPowerOfTwo(3));
        System.out.println("powerOfTwo.isPowerOfTwo(-01) = " + powerOfTwo.isPowerOfTwo(-16));
    }

    public boolean isPowerOfTwo(int n) {
        if (n == 0) return false;
        n = Math.abs(n);
        while (n != 1) {
            if (n % 2 == 1) {
                return false;
            }
            n /= 2;
        }
        return true;
    }
}
