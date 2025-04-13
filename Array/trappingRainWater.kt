class Solution {
    fun trap(height: IntArray): Int {
        // O(n) time, O(1) space
        val n = height.size
        var res = 0
        var l = 0
        var maxL = height[l]
        var r = n-1
        var maxR = height[r]

        while (l < r) {
            if (maxL <= maxR) {
                l++
                maxL = maxOf(maxL, height[l])
                res+= maxL - height[l]
            } else {
                r--
                maxR = maxOf(maxR, height[r])
                res+= maxR - height[r]
            }
        }

        return res
    }
}
