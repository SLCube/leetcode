package algorithm2.day2;

/**
 * 162. Find Peak Element
 */
public class Q162 {
    public static void main(String[] args) {
        Q162 q162 = new Q162();
        q162.findPeekElement(new int[]{1, 2, 3, 1});
    }

    public int findPeekElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[mid] < nums[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return right;
    }
}
