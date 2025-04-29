public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;
        ListNode prev = dummyHead;
        ListNode M = head;
        
        for(int i = 1; i < m; i++) {
            prev = prev.next;
            M = M.next;
        }
        
        for(int i = 0; i < n - m; i++) {
            ListNode current = M.next;
            M.next = current.next;
            current.next = prev.next;
            prev.next = current;
        }
        return dummyHead.next;
   }
