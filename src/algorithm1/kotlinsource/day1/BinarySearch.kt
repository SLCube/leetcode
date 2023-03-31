package algorithm1.kotlinsource.day1

class BinarySearch {
    fun search(nums: IntArray, target: Int): Int {
        var left = 0
        var right: Int = nums.size - 1

        while (left <= right) {
            val mid: Int = (left + right) / 2

            if (nums[mid] == target) {
                return mid
            } else if (nums[mid] > target) {
                right = mid - 1
            } else {
                left = mid + 1
            }
        }
        return -1
    }
}

fun main() {
    val binarySearch = BinarySearch()
    val nums: IntArray = intArrayOf(-1, 0, 3, 5, 9, 12)

    println("binarySearch.search(nums, 9) = ${binarySearch.search(nums, 9)}")
    println("binarySearch.search(nums, 2) = ${binarySearch.search(nums, 2)}")

}