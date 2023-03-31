package algorithm1.day1;

public class BinarySearch {

    public static void main(String[] args) {
        int[] numArr = {-1, 0, 3, 5, 9, 12};

        int target1 = 9;
        int target2 = 2;

        System.out.println("search(numArr, target1) = " + search(numArr, target1));
        System.out.println("search(numArr, target2) = " + search(numArr, target2));
    }

    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}
