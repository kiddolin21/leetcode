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
    fun reverseList(head: ListNode?): ListNode? {
        // iterate
        // var prev: ListNode? = null
        // var cur = head
        // while (cur !== null ) {
        //     val temp = cur.next
        //     cur.next = prev
        //     prev = cur
        //     cur = temp
        // }
        // return prev
        // recursive
        if (head == null) return null

        var newHead = head
        if (head.next !== null) {
            newHead = reverseList(head.next)
            head.next.next = head
        }
        head.next = null

        return newHead
    }
}
