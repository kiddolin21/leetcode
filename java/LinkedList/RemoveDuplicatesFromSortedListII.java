public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode prev = (head.val == head.next.val)? dummy : head;
        ListNode current = head.next;
        int val = head.val;
        while(current != null) {
            if(current.val != val) {
                val = current.val;
                if(current.next == null || current.next.val != val) {
                    prev.next = current;
                    prev = prev.next;
                }
            }
            current = current.next;
        }
        prev.next = current;
        return dummy.next;
    }
