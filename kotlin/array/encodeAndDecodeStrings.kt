class Codec {
    // REVIEW
    // Encodes a list of strings to a single string.
    fun encode(strs: List<String>): String {
        var res = ""
        for (str in strs) {
            res += str.length
            res += "#"
            res += str
        }
        return res
    }
    
    // Decodes a single string to a list of strings.
    fun decode(s: String): List<String> {
        val res = mutableListOf<String>()
        var i = 0
        while (i < s.length) {
            var j = i
            while (s[j] !== '#') j++
            val length = s.substring(i, j).toInt()
            i = j+1
            res.add(s.substring(i, i+length))
            i += length
        }
        return res
    }
}

/**
 * Your Codec object will be instantiated and called as such:
 * var obj = Codec()
 * val s = obj.encode(strs)
 * val ans = obj.decode(s)
 */
