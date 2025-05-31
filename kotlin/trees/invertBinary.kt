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
    fun invertTree(root: TreeNode?): TreeNode? {
        if (root == null || root.left == null && root.right == null) return root
        val invertedLeft = invertTree(root.left)
        val invertedRight = invertTree(root.right)
        root.left = invertedRight
        root.right = invertedLeft
        return root
    }
}
