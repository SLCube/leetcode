package algorithm1.day1;

public class SearchInsertPosition {

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        System.out.println("searchInsert(nums, 5) = " + searchInsert(nums, 5));
        System.out.println("searchInsert(nums, 2) = " + searchInsert(nums, 2));
        System.out.println("searchInsert(nums, 7) = " + searchInsert(nums, 7));

    }

    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return Math.min(left, right) + 1;
    }
}
