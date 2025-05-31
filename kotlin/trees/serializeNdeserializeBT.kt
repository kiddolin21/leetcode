/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Codec() {
	// Encodes a URL to a shortened URL.
    fun serialize(root: TreeNode?): String {
        if (root == null) return "N"
        return "${root.`val`},${serialize(root.left)},${serialize(root.right)}"
    }

    // Decodes your encoded data to tree.
    fun deserialize(data: String): TreeNode? {
        val vals = data.split(",")
        var i = 0

        fun dfs(): TreeNode? {
            if (vals[i] == "N") {
                i++
                return null
            }
            val node = TreeNode(vals[i].toInt())
            i++
            node.left = dfs()
            node.right = dfs()
            return node
        }
        return dfs()
    }
}

/**
 * Your Codec object will be instantiated and called as such:
 * var ser = Codec()
 * var deser = Codec()
 * var data = ser.serialize(longUrl)
 * var ans = deser.deserialize(data)
 */
