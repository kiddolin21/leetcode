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
    fun kthSmallest(root: TreeNode?, k: Int): Int {
        var count = 0
        var curr = root
        val stack = ArrayDeque<TreeNode>()
        while (curr != null) {
            stack.addLast(curr)
            curr = curr.left
        }
        while (stack.isNotEmpty()) {
            curr = stack.removeLast()
            count++
            if (count == k) return curr.`val`
            if (curr.right != null) {
                curr = curr.right
                while (curr != null) {
                    stack.addLast(curr)
                    curr = curr.left
                }
            }
        }
        return -1
    }
}
