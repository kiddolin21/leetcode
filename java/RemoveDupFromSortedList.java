public ListNode deleteDuplicates(ListNode head) {
        if(head==null||head.next==null) return head;
        ListNode current = head.next;
        ListNode prev = head;
        while(current!=null) {
            if(current.val==prev.val) {
                prev.next = current.next;
            }
            else {
                prev = prev.next;
            }
            current = current.next;
        }
        return head;
    }
