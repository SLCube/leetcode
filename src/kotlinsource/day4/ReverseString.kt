package kotlinsource.day4

class ReverseString {
    fun reverseString(s: CharArray): Unit {
        var left = 0
        var right = s.lastIndex
        while (left < right) {
            var temp = s[left]
            s[left] = s[right]
            s[right] = temp
            left += 1
            right -= 1
        }
    }
}