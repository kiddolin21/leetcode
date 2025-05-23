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
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        var head = ListNode(-101)
        var cur = head
        var p1 = list1
        var p2 = list2
        while(p1 !== null && p2 !== null) {
            if (p1!!.`val` <= p2!!.`val`) {
                cur.next = p1
                p1 = p1.next
            } else {
                cur.next = p2
                p2 = p2.next
            }
            cur = cur.next
        }
        cur.next = if (p1 == null) p2 else p1
        return head.next
    }
}
