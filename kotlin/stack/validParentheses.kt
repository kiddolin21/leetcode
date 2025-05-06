import java.util.ArrayDeque
class Solution {
    val openB = setOf<Char>('(', '{', '[')
    val closeB = setOf<Char>(')', '}', ']')
    val map = mapOf<Char, Char>(')' to '(','}' to '{',']' to '[')
    fun isValid(s: String): Boolean {
        val stack = ArrayDeque<Char>()
        for (c in s) {
            if (closeB.contains(c)) {
                if (!stack.isEmpty() && stack.peek() == map[c]) {
                    stack.pop()
                } else {
                    return false
                }
            } else {
                stack.push(c)
            }
        }
        return stack.isEmpty()
    }
}
