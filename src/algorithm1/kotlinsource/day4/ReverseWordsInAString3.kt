package algorithm1.kotlinsource.day4

class ReverseWordsInAString3 {
    fun reverseWords(s: String): String {
        var strings = s.split(" ")
        var sb = StringBuilder()

        for (index in strings.indices) {
            val reverseChars = reverse(strings.get(index).toCharArray())
            sb.append(reverseChars).append(" ")
        }

         val result = sb.toString()
        return result.substring(0, result.lastIndex)
    }

    private fun reverse(chars: CharArray): CharArray {
        var left = 0
        var right = chars.lastIndex

        while (left < right) {
            var temp = chars[left]
            chars[left] = chars[right]
            chars[right] = temp
            left += 1
            right -= 1
        }

        return chars
    }
}