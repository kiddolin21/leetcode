public ListNode partition(ListNode head, int x) {
        if(head == null || head.next == null) return head;
        ListNode prevHead = new ListNode(0);
        ListNode follHead = new ListNode(0);
        ListNode p1 = prevHead;
        ListNode p2 = follHead;
        
        while(head != null) {
            ListNode tmp = head;
            if(head.val < x) { 
                p1.next = tmp; p1 = p1.next; }
            else {
                p2.next = tmp; p2 = p2.next;}
            head = head.next;
            tmp.next = null;
        }
        p1.next = follHead.next;
        return prevHead.next;
    }
