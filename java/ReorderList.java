c class Solution {
    public void reorderList(ListNode head){
          if(head == null || head.next == null) return;
          ListNode h = reorderList(head, head,head);
     }

    public ListNode reorderList(ListNode prev, ListNode slow, ListNode faster){
        if(faster == null || faster.next == null) {
            if(faster != null) {
                ListNode reverse = slow.next;
                slow.next = null;
                return reverse;
            }
            prev.next = null;
            return slow;
        }
        ListNode retNode = reorderList(slow, slow.next, faster.next.next); // concanate
        ListNode temp = retNode.next;
        retNode.next = slow.next;
        slow.next = retNode;
        return temp;
    }
}
