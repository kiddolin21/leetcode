class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {
        // 2 sum
        nums.sort()
        val n = nums.size
        val res = mutableListOf<List<Int>>()
        for (i in 0..n - 3) {
            if (nums[i] > 0) break
            if (i > 0 && nums[i] == nums[i - 1]) continue
            val target = -nums[i]
            var l = i + 1
            var r = n - 1
            while (l < r) {
                if (nums[l] + nums[r] == target) {
                    res.add(listOf(nums[i], nums[l], nums[r]))
                    l++
                    r--
                    while (l < r && nums[l] == nums[l - 1]) l++
                }
                while (l < r && (nums[l] + nums[r] < target)) l++
                while (l < r && (nums[l] + nums[r] > target)) r--
            } 
        }
        return res
    }
}
