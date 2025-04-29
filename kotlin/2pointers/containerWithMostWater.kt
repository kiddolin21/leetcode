class Solution {
    fun maxArea(height: IntArray): Int {
        // my solution: O(n^2) - time limit exceeded
        val n = height.size
        var res = 0
        // for (i in 0..n-2) {
        //     var j = i + 1
        //     while (j <= n - 1) {
        //         val amount = minOf(height[i], height[j]) * (j-i)
        //         res = maxOf(res, amount)
        //         j++
        //     }
        // }
        // O(n)
        var l = 0
        var r = n - 1
        while (l < r) {
            val amount = minOf(height[l], height[r]) * (r-l)
            res = maxOf(res, amount)
            if (height[l] > height[r]) {
                r--
            } else {
                l++
            }
        }

        return res
    }
}
