class Solution {
    fun largestRectangleArea(heights: IntArray): Int {
        // My solution
        // val rights = IntArray(heights.size)
        // val lefts = IntArray(heights.size)
        // val stack = ArrayDeque<Int>()
        // for (i in heights.indices) {
        //     while (stack.isNotEmpty() && heights[stack.last()] > heights[i]) {
        //         rights[stack.last()] = i - 1
        //         stack.removeLast()
        //     }
        //     stack.addLast(i)
        // }
        // // clean up
        // while (stack.isNotEmpty()) {
        //     rights[stack.last()] = heights.size - 1
        //     stack.removeLast()
        // }

        //  for (i in heights.size-1 downTo 0) {
        //     while (stack.isNotEmpty() && heights[stack.last()] > heights[i]) {
        //         lefts[stack.last()] = i + 1
        //         stack.removeLast()
        //     }
        //     stack.addLast(i)
        // }

        // while (stack.isNotEmpty()) {
        //     lefts[stack.last()] =  0
        //     stack.removeLast()
        // }
        // var res = 0
        // for (i in heights.indices) {
        //     res = maxOf(res, heights[i] * (rights[i] - lefts[i] + 1))
        // }
        // return res
         val stack = ArrayDeque<Pair<Int, Int>>()
         var res = 0
         for (i in heights.indices) {
            var index = i
            while (stack.isNotEmpty() && stack.last().second > heights[i]) {
                res = maxOf(res, (i - stack.last().first) * stack.last().second)
                index = stack.last().first
                stack.removeLast()
            }
            stack.addLast(index to heights[i])
         }
         while(stack.isNotEmpty()) {
            res = maxOf(res, (heights.size - stack.last().first) * stack.last().second)
            stack.removeLast()
         }
         return res
    }
}
