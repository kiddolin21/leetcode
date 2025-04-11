class Solution {
    fun longestConsecutive(nums: IntArray): Int {
        if (nums.isEmpty()) return 0
        // my solution after looking at hint2
        val set = nums.toSet()
        val starters = HashSet<Int>()
        var res = 1
    
        for (n in set) {
            if (!set.contains(n-1)) starters.add(n)
        }
        for (n in starters) {
            var target = n
            var seq = 1
            while (set.contains(target+1)) {
                seq++
                target++
            }
            res = if (res>seq) res else seq
        }
       
        return res
    }
}
