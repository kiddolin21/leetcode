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
    fun maxPathSum(root: TreeNode?): Int {
        var res = Int.MIN_VALUE
        fun dfs(root: TreeNode?): Int {
            if (root == null) return 0
            val leftMax = maxOf(dfs(root.left), 0)
            val rightMax = maxOf(dfs(root.right), 0)
            res =  maxOf(res, root.`val` + leftMax + rightMax)
            return root.`val`+ maxOf(leftMax, rightMax)
        }
        dfs(root)
        return res
    }
}
