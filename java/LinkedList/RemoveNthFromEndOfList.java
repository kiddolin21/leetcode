public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null) return head;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode fast = dummy, slow = dummy, prev = null;
        for(int i = 0; i < n; i++) fast = fast.next;
        while(fast != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next;
        }
        prev.next = slow.next;
        return dummy.next;
    }
