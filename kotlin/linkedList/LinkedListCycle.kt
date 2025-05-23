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
    fun hasCycle(head: ListNode?): Boolean {
    //     var cur = head
    //     while (cur !== null) {
    //         if (cur.`val` == Int.MIN_VALUE) return true
    //         cur.`val` = Int.MIN_VALUE
    //         cur = cur.next
    //     }
    //     return false
        // fast and slow pointer
        var slow = head
        var fast = head
        while (fast !== null && fast?.next !== null) {
            slow = slow?.next
            fast = fast?.next?.next
            if (slow == fast) return true
        }
        return false
    }
}
