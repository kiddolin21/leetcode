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
    fun reverseKGroup(head: ListNode?, k: Int): ListNode? {
        val dummyHead = ListNode(0)
        dummyHead.next = head
        var groupPrev = dummyHead

        while (true) {
            val kth = getKth(groupPrev, k)
            if (kth == null) {
                break
            }
            val groupNext = kth.next

            var prev: ListNode? = groupNext
            var curr = groupPrev!!.next
              while (curr != groupNext) {
                val next = curr!!.next
                curr.next = prev
                prev = curr
                curr = next
            }
            val tmp = groupPrev.next
            groupPrev.next = kth
            groupPrev = tmp
        }
        return dummyHead.next  
    }
    
     private fun getKth(curr: ListNode?, k: Int): ListNode? {
        var curr = curr
        var k = k
        while (curr != null && k > 0) {
            curr = curr.next
            k--
        }
        return curr
    }


    //     val lists = mutableListOf<Pair<ListNode?, ListNode?>>()
    //     var cur = head
    //     while (cur !== null) {
    //         val head = cur
    //         var end = cur
    //         for (i in 1..k - 1) {
    //             end = end?.next
    //             if (end == null) break
    //        }
    //        lists.add(head to end)
    //        cur = end?.next
    //        end?.next = null
    //     }

    //     for (list in lists) {
    //         reverse(list)
    //     }
        
    //     val dummyHead = ListNode(0)
    //     cur = dummyHead
    //     for (list in lists) {
    //         if (list.second == null) {
    //             cur?.next = list.first
    //         } else {
    //         cur?.next = list.second
    //         cur = list.first
    //         }
    //     }
    //     return dummyHead.next
    // }

    // private fun reverse(list: Pair<ListNode?, ListNode?>) {
    //     if (list.second == null) return
    //     var prev: ListNode? = null
    //     var cur = list.first
    //     while (cur !== null) {
    //         val next = cur.next
    //         cur.next = prev
    //         prev = cur
    //         cur = next
    //     }
    // }
}
