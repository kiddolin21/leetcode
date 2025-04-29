class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        // My solution: hash table wit key sorted string, value strings
        // REVIEW: time: O(nmlogm), space: O(nk)
        if (strs.size == 1) return listOf(listOf(strs[0]))

        val map: MutableMap<String, MutableList<String>> = mutableMapOf()
        for (str in strs) {
            // val key = sortString(str)
            val key = generateKey(str)
            map[key] = map[key]?.let {
                it.add(str)
                it
            } ?: mutableListOf(str)
        }
        return map.values.toList()
    }

    // private fun sortString(str: String): String {
    //     val charArray = str.toCharArray()
    //     charArray.sort()
    //     return String(charArray)
    // }

    // REVIEW: solution 2 - catagorize by count
    // key: count of each letter, joint by some char: 1,2,3,0,1..
    // time: O(NK), space(NK)
    private fun generateKey(str: String): String {
        val counters: IntArray = IntArray(26)
        for (c in str.toCharArray()) {
            counters[c - 'a']++
        }
        return counters.joinToString(",")
    }
}
