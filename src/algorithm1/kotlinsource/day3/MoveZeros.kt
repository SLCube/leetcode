package algorithm1.kotlinsource.day3

class MoveZeros {
    fun moveZeros(nums: IntArray): Unit {
        var zeroPointer = 0

        for ((index, _) in nums.withIndex()) {
            if (nums[index] != 0) {
                var temp = nums[zeroPointer]
                nums[zeroPointer] = nums[index]
                nums[index] = temp
                zeroPointer += 1
            }
        }
    }
}

fun main() {
    val moveZeros = MoveZeros()
    val nums: IntArray = intArrayOf(0, 1, 0, 3, 12)
    moveZeros.moveZeros(nums)


}