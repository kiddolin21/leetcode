class Solution {
    fun dailyTemperatures(temperatures: IntArray): IntArray {
        val stack = ArrayDeque<Int>()
        val answer = IntArray(temperatures.size) { 0 }
        for (i in temperatures.indices) {
            while (!stack.isEmpty() && temperatures[stack.last()] < temperatures[i]) {
                val prev = stack.removeLast()
                answer[prev] = i - prev
            }
            stack.addLast(i)
        }
        return answer
    }
}
