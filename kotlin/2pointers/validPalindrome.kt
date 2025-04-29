class Solution {
    fun isPalindrome(s: String): Boolean {
        var start = 0
        var end = s.length - 1
        while (start < end) {
            //REVIEW: why need start < end? because it can be all useless chars left
            while (start < end && !s[start].isLetterOrDigit()) start++
            while (end > start && !s[end].isLetterOrDigit()) end--
            if (s[start++].lowercaseChar() !== s[end--].lowercaseChar()) return false
        }
        return true
    }
}
