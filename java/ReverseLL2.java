public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        ListNode M = head;
        
        for(int i=1;i<m;i++) {
            pre = pre.next;
            M = M.next;
        }
        
        for(int i=0;i<n-m;i++) {
            ListNode current = M.next;
            M.next = current.next;
            current.next = pre.next;
            pre.next = current;
        }
        return dummy.next;
    }
