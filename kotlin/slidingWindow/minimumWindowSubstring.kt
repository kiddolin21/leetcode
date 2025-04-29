class Solution {
    fun minWindow(s: String, t: String): String {
        // my approach
        val tMap = IntArray(58) { 0 }
        for (c in t) {
            tMap[c - 'A'] += 1
        }

        val sMap = IntArray(58) { 0 }
        var l = 0
        var r = 0
        var res = ""
        while (l < s.length) {
            if (isMatch(sMap, tMap)) {
                val sub = s.substring(l, r)
                res = if (res === "") {
                    sub
                } else if (sub.length < res.length) {
                    sub
                } else {
                    res
                }
                // found match move l
                sMap[s[l] - 'A'] -= 1
                l++
                while (l < s.length && tMap[s[l]- 'A'] == 0) l++
            } else {
                // no match move r
                if (r >= s.length) break
                sMap[s[r] - 'A'] += 1
                r++
            }
        }
        return res
    }

    private fun isMatch(map1: IntArray, map2: IntArray): Boolean {
        for (i in map1.indices) {
            if (map1[i] < map2[i]) return false
        }
        return true
    }
}
