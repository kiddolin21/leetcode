class Solution {
    val operators = setOf<String>("+", "-", "*", "/")

    fun evalRPN(tokens: Array<String>): Int {
        val stack = ArrayDeque<Int>()
        for (t in tokens) {
            if (operators.contains(t)) {
                val int2 = stack.removeLast()
                val int1 = stack.removeLast()
                val res = when (t) {
                    "+" -> int1 + int2
                    "-" -> int1 - int2
                    "*" -> int1 * int2
                    "/" -> int1 / int2
                    else -> 0
                }
                stack.addLast(res)
            } else {
                stack.addLast(t.toInt())
            }
        }
        return stack.last()
    }
}
