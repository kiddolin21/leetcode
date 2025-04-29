public ListNode reverseList(ListNode head) {
        if(head == null)  return null;
        ListNode newHead = null;
        ListNode current = head;
        ListNode next;
        
        while(current != null) {
            next = current.next;
            current.next = newHead;
            newHead = current;
            current = next;
        }
        return newHead;
}
