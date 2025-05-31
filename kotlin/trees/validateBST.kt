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
    fun isValidBST(root: TreeNode?): Boolean {
        
        fun dfs(root: TreeNode?, max: Int?, min: Int?): Boolean {
            if (root == null) return true
            if ((min == null || root.`val` > min) && (max == null || root.`val` < max)) {
                return dfs(root.left, root.`val`, min) && dfs(root.right, max, root.`val`)
            } else {
                return false
            }
        }
        return dfs(root, null, null)
    }
}
