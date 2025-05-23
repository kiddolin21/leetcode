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
    fun reorderList(head: ListNode?): Unit {
        if (head == null || head.next == null || head.next.next == null) return
        var slow = head
        var fast = head?.next
        while (fast != null && fast?.next !== null) {
            slow = slow?.next
            fast = fast?.next?.next
        }
        // slow.next is the head of second half 
        // reverse second half
        var prev: ListNode? = null
        var curr = slow?.next
        slow?.next = null
        while (curr != null) {
            val next = curr.next
            curr.next = prev
            prev = curr
            curr = next
        }
        // prev is the new head of reversed second half
        var curr2 = prev
        var curr1 = head
        var newCurr: ListNode? = ListNode(0)
        while (curr1 !== null && curr2 !== null) {
            newCurr?.next = curr1
            curr1 = curr1?.next
            newCurr = newCurr?.next
            newCurr?.next = curr2
            curr2 = curr2?.next
            newCurr = newCurr?.next
        }
        newCurr?.next = if (curr2 !== null) curr2 else curr1
    }
}
