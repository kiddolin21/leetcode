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
    fun isBalanced(root: TreeNode?): Boolean {
        return dfs(root).first
    }

    private fun dfs(root: TreeNode?): Pair<Boolean, Int> {
        if (root == null) return (true to 0)
        val left = dfs(root.left)
        val right = dfs(root.right)
        val isBalanced = left.first && right.first && abs(left.second - right.second) <= 1
        val depth = maxOf(left.second, right.second) + 1
        return (isBalanced to depth)
    }
}
