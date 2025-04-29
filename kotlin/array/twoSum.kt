class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        // Solution 1 - hash map for value and index
        if (nums.size == 2) return intArrayOf(0, 1)

        val numberByIndex: MutableMap<Int, Int> = mutableMapOf()
        for (i in 0..nums.size - 1) {
            val m = target - nums[i]
            numberByIndex[m]?.let {
                return intArrayOf(it, i)
            } 
            numberByIndex[nums[i]] = i
            
        }
    }
}
