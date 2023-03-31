package algorithm1.kotlinsource.day3

class TwoSum2 {
    fun twoSum2(numbers: IntArray, target: Int): IntArray {
        var left = 0
        var right = numbers.size - 1

        while (left < right) {
            val expected = numbers[left] + numbers[right]
            if (expected == target) {
                break
            } else if (expected < target) {
                left += 1
            } else {
                right -= 1
            }
        }

        return intArrayOf(left + 1, right + 1)
    }
}

fun main() {

}