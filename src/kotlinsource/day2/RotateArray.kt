package kotlinsource.day2

class RotateArray {
    fun rotate(nums: IntArray, k: Int): Unit {
        var target: Int = k
        if (nums.size < target) {
            target %= nums.size
        }

        reverse(nums, 0, nums.size - 1)
        reverse(nums, 0, target - 1)
        reverse(nums, target, nums.size - 1)
    }

    private fun reverse(nums: IntArray, i: Int, j: Int) {
        var left = i
        var right = j
        while (left <= right) {
            val temp: Int = nums[left]
            nums[left] = nums[right]
            nums[right] = temp
            left--
            right++
        }
    }
}

fun main() {

}