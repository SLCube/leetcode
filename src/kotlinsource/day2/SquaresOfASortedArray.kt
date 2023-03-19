package kotlinsource.day2

class SquaresOfASortedArray {
    fun sortedSquares(nums: IntArray): IntArray {
        for (i: Int in nums.indices) {
            nums[i] = nums[i] * nums[i]
        }

        nums.sort()
        return nums;
    }
}

fun main() {
    val squaresOfASortedArray = SquaresOfASortedArray()
    val nums: IntArray = intArrayOf(-4, -1, 0, 3, 10)
    val results = squaresOfASortedArray.sortedSquares(nums)
    for (num in nums) {
        println("num = ${num}")
    }
}