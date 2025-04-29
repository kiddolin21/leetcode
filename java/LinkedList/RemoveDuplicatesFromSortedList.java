public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode prev = head;
        while(prev != null && prev.next != null) {
            if(prev.next.val == prev.val) {
                prev.next = prev.next.next;
            } else {
                prev = prev.next;
            }
        }
        return head;
    }
