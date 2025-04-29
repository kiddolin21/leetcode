public ListNode partition(ListNode head, int x) {
        if(head == null || head.next == null) return head;
        ListNode smallHead = new ListNode(-1), small = smallHead;
        ListNode bigHead = new ListNode(-1), big = bigHead;
        
        while(head != null) {
            ListNode tmp = head;
            if(head.val < x) {
                small.next = head;
                small = small.next;
            } else {
                big.next = head;
                big = big.next;
            }
            head = head.next;
            tmp.next = null;
            
        }
        small.next = bigHead.next;
        return smallHead.next;
    }
