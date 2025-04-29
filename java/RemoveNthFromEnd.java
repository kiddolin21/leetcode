public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null) return null;
        int count = 0;
        ListNode fast = head;
        ListNode low = head;
        while(fast.next!=null){
            count++;
            fast = fast.next;
            if(count>n) low = low.next;
        }
        if(count<n) head = head.next;
        else low.next = low.next.next;
        return head;
    }
