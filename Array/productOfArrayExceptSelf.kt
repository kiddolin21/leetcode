class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        // REVIEW: 看了hint考虑到要store additiona info
        // val pBefore = IntArray(nums.size)
        // pBefore[0] = 1
        // val pAfter = IntArray(nums.size)
        // pAfter[nums.size-1] = 1
        // for (i in 1..nums.size-1) {
        //     pBefore[i] = pBefore[i-1]*nums[i-1]
        // }
        // for (i in nums.size-2 downTo 0) {
        //     pAfter[i] = pAfter[i+1]*nums[i+1]
        // }
        // val res = IntArray(nums.size)
        // for (i in nums.indices) {
        //     res[i] = pBefore[i] * pAfter[i]
        // }
        // return res

        // Followup: O(1) space
        val res = IntArray(nums.size) { 1 }
        var prefix = 1
        for (i in nums.indices) {
            res[i]=prefix
            prefix *= nums[i]
        }
        var postfix = 1
        for (i in nums.size-1 downTo 0) {
            res[i] *= postfix
            postfix *= nums[i]
        }
        return res
    }
}
