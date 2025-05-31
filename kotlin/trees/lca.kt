/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int = 0) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun lowestCommonAncestor(root: TreeNode?, p: TreeNode?, q: TreeNode?): TreeNode? {
        // recursive
        if (root == null || p == null || q == null) return null
        // return when {
        //     maxOf(p.`val`, q.`val`) < root.`val` -> lowestCommonAncestor(root.left, p, q)
        //     minOf(p.`val`, q.`val`) > root.`val` ->  lowestCommonAncestor(root.right, p, q)
        //     else -> root
        // }
        // iteration
        val l = if (p.`val` <= q.`val`) p.`val` else q.`val`
        val h = if (p.`val` > q.`val`) p.`val` else q.`val`
        var curr = root
        while (curr != null) {
            if (curr.`val` < l) {
                curr = curr.right
            } else if (curr.`val` > h) {
                curr = curr.left
            } else {
                return curr
            }
        }
        return null
    }
}
