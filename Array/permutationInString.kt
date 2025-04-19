class Solution {
    fun checkInclusion(s1: String, s2: String): Boolean {
        val n = s2.length
        val m = s1.length
        if (n < m) return false
        // my solution: O(n*m) O(1)
        // val freq  = buildFreq(s1)
        // val set = s1.toCharArray().toSet()
    //     for (i in 0..n-m) {
    //         val j = i + m 
    //         if (!set.contains(s2[i])) continue
    //         if (isPermutation(s2.substring(i, j), freq)) return true
    //     }
    //     return false
        // Optimial
        val s1Count = IntArray(26)
        val s2Count = IntArray(26)
        for (i in s1.indices) {
            s1Count[s1[i] - 'a']++
            s2Count[s2[i] - 'a']++
        }

        var matches = 0
        for (i in 0 until 26) {
            if (s1Count[i] == s2Count[i]) matches++
        }

        for (l in 0..n-m) {
            val r = l + m
            if (matches == 26) return true
            if (r >= n) break
            val index = s2[r] - 'a'
            s2Count[index]++
            if (s1Count[index] == s2Count[index]) {
                matches++
            } else if (s1Count[index] == s2Count[index] - 1) {
                matches--
            }
            val lIndex = s2[l] - 'a'
            s2Count[lIndex]--
            if (s1Count[lIndex] == s2Count[lIndex]) {
                matches++
            } else if (s1Count[lIndex] == s2Count[lIndex] + 1) {
                matches--
            }
        }
        return matches == 26
    }

    // private fun buildFreq(s: String): IntArray {
    //     val array = IntArray(26) { 0 }
    //     for (c in s.toCharArray()) {
    //         array[c - 'a']++
    //     }
    //     return array
    // }

    // private fun isPermutation(s: String, arr: IntArray): Boolean {
    //     val copy = arr.copyOf()
    //     for (c in s.toCharArray()) {
    //         if (--copy[c - 'a'] < 0) {
    //             return false
    //         }
    //     }
    //     return true
    // }
}
