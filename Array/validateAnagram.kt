class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length !== t.length) return false
        // sort the strings and compare
        // // time: O(nlogn), space: O(n) 
        // val sortedS = s.toCharArray()
        // sortedS.sort()
        // val sortedT = t.toCharArray()
        // sortedT.sort()
        // return String(sortedS) == String(sortedT)

        // REVIEW: Solution 2 - counters for each letter
        // 没有想到frequency，顺序其实不重要
        val counterByLetter = IntArray(26)
        for (i in 0..s.length-1) {
            counterByLetter[s[i] - 'a']++
        }
        for (i in 0..t.length-1) {
            counterByLetter[t[i] - 'a']--
            if (counterByLetter[t[i] - 'a'] < 0) return false
        }
        return true

        // if unicode, represent the string as an array of Int, value is the
        // delta for the base 0, then it becomes comparing 2 Int arrays
        // REVIEW: or use hashmap to store frequency, key: unicode charactor, value: frequency
    }
}
