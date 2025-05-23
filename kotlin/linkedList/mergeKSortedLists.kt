/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun mergeKLists(lists: Array<ListNode?>): ListNode? {
        // min heap
        val minHeap = PriorityQueue(compareBy<ListNode> { it.`val` })
        for (l in lists) {
            l?.let { minHeap.add(it) }
        }

        val dummyHead = ListNode(0)
        var curr: ListNode? = dummyHead
        while (minHeap.isNotEmpty()) {
            val minNode = minHeap.poll()
            curr?.next = minNode
            minNode.next?.let { minHeap.add(it) }
            curr = curr?.next
        }
        return dummyHead.next
    }
}
