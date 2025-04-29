public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null)             
                     return head;         
             ListNode second = head.next;        
             head.next = null;         
            ListNode newHead = reverseList(second);         
            second.next = head;         
            return newHead;
    }
