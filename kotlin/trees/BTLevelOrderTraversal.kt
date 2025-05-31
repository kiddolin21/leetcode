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
    fun levelOrder(root: TreeNode?): List<List<Int>> {
        val map = HashMap<Int, MutableList<Int>>()
        dfs(root, 0, map)
        return (0 until map.size).map { map[it]!! }
    }

    private fun dfs(root: TreeNode?, level: Int, map: MutableMap<Int, MutableList<Int>>) {
        if (root == null) return
        val list = map.getOrPut(level) { mutableListOf() }
        list.add(root.`val`)
        dfs(root!!.left, level + 1, map)
        dfs(root!!.right, level + 1, map)
    }
}
