public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) return true;
        ListNode fast = head;
        ListNode slow = head;
        
        while(fast.next!=null && fast.next.next!=null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        
        ListNode next = slow.next.next;
        ListNode tail = slow.next;
        
        while(next!=null) {
            ListNode tmp = slow.next;
            slow.next = next;
            tail.next = next.next;
            next.next = tmp;
            next = tail.next;
        }
        
        while(slow.next!= null) {
            if(head.val != slow.next.val) return false;
            slow = slow.next;
            head = head.next;
        }
        return true;
    }
