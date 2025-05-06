class Solution {
    
    fun generateParenthesis(n: Int): List<String> {
        val stack = ArrayDeque<String>()
        val res = mutableListOf<String>()

        fun backtracking(openN: Int, closeN: Int) {
            if (openN == closeN && closeN == n) {
                res.add(stack.joinToString(""))
                return
            }

            if (openN < n) {
                stack.addLast("(")
                backtracking(openN + 1, closeN)
                stack.removeLast()
            }

            if (openN > closeN) {
                stack.addLast(")")
                backtracking(openN, closeN + 1)
                stack.removeLast()
            }
        }


        backtracking(0, 0)
        return res
    }
}
