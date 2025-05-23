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
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        var p1 = l1
        var p2 = l2
        val dummyHead = ListNode(0)
        var p3: ListNode? = dummyHead
        var carry = 0
        while (p1 !== null || p2 !== null || carry !== 0) {
            val res = (p1?.`val` ?: 0) + (p2?.`val` ?: 0) + carry
            p3?.next = ListNode(res % 10)
            carry = res / 10
            p1 = p1?.next
            p2 = p2?.next
            p3 = p3?.next
        }
        return dummyHead.next
    }
}
