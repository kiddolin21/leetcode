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
    fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean {
        return if (p == null && q == null) {
            true
        } else if (p == null && q != null || p != null && q == null){
            false
        } else {
            p?.`val` == q?.`val` && isSameTree(p?.left, q?.left) && isSameTree(q?.right, p?.right)
        }
    }
}
