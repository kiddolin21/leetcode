class Solution {
    fun characterReplacement(s: String, k: Int): Int {
        var res = 0
        var l = 0
        val count = HashMap<Char, Int>()
        for (r in 0..s.length-1) {
            count[s[r]] = count.getOrDefault(s[r], 0) + 1
            while (r - l + 1 - count.values.maxOf { it } > k) {
                count.computeIfPresent(s[l]) { _, v -> v - 1 }
                l++
            }
            res = maxOf(res, r - l + 1)
        }
        return res
    }
}
