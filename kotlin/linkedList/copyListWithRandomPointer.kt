/**
 * Example:
 * var ti = Node(5)
 * var v = ti.`val`
 * Definition for a Node.
 * class Node(var `val`: Int) {
 *     var next: Node? = null
 *     var random: Node? = null
 * }
 */

class Solution {
    fun copyRandomList(node: Node?): Node? {
        val map = HashMap<Node?, Node?>()

        var curr = node
        while (curr !== null) {
            val copyNode = Node(curr.`val`)
            map[curr] = copyNode
            curr = curr.next
        }

        curr = node
        while(curr !== null) {
            val copy = map[curr]
            copy?.next = map[curr.next]
            copy?.random = map[curr.random]
            curr = curr.next
        }
        return map[node]
    }
}
