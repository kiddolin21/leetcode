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
    fun goodNodes(root: TreeNode?): Int {
        var res = 0

        fun dfs(root: TreeNode?, max: Int) {
            if (root == null) return
            if (root.`val` >= max) res++
            val max = maxOf(max, root.`val`)
            dfs(root.left, max)
            dfs(root.right, max)
        }
        dfs(root, Int.MIN_VALUE)
        return res
    }
}
