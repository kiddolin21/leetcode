class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        val n = s.length
        if (n < 2) return n
        var res = 0
        var l = 0
        val set = HashSet<Char>()
        for (r in 0..n-1) {
            while (set.contains(s[r])) {
                set.remove(s[l])
                l++
            }
            set.add(s[r])
            res = maxOf(res, r - l + 1)
        }
        return res
    }
}
