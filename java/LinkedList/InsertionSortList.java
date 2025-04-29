public ListNode insertionSortList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode dummy = new ListNode(-1), current = head;
        
        while(current != null) {
            ListNode p = dummy;
            while(p.next != null && p.next.val < current.val){
                p = p.next;
            } 
            
            ListNode next = current.next;
            ListNode pnext = p.next;
            p.next = current;
            current.next = pnext;
            current = next;
        }
        return dummy.next;
    }
