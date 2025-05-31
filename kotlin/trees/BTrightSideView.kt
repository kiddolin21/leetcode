/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    fun rightSideView(root: TreeNode?): List<Int> {
        val map = HashMap<Int, Int>()

        fun dfs(root: TreeNode?, level: Int) {
            if (root == null) return
            map[level] = root.`val`
            dfs(root.left, level + 1)
            dfs(root.right, level + 1)
        }

        dfs(root, 0)
        return (0 until map.size).map { map[it]!! }
    }
}
