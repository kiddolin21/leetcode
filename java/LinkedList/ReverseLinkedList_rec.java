public ListNode reverseList(ListNode head) {
        if(head == null)  return null;
        return helper(head, null);
    }
    
    private ListNode helper(ListNode current, ListNode newHead) {
        if(current == null) return newHead;
        ListNode next = current.next;
        current.next = newHead;
        newHead = current;
        return helper(next, newHead);
    }
