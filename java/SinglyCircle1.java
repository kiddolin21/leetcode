/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode rubbit = head;
        ListNode tortoise = head;
        while ((rubbit != null && rubbit.next != null) && tortoise != null) { 
            rubbit = rubbit.next.next;
            tortoise = tortoise.next;
            if(rubbit == tortoise) return true;
        }
        return false;
        
    }
}

