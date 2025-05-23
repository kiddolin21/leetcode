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
    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
        var f = head
        var l = head
        var p: ListNode? = null
        for (i in 1..n) {
            l = l?.next
        }
        while(l !== null) {
            p = f
            f = f?.next
            l = l?.next
        } 
        if (p == null) {
            return f?.next
        } else {
            p?.next = f?.next
            return head
        }
    }
}
