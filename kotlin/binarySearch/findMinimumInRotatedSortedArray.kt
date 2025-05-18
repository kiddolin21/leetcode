class Solution {
    fun findMin(nums: IntArray): Int {
        var l = 0
        var r = nums.size - 1
        while (l <= r) {
            val mid = (r + l) / 2
            if (nums[l] <= nums[mid] && nums[mid] <= nums[r]) return nums[l]
            l = l + 1
        }
        return nums[0]
    }
}
