public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0) return head;
        int len = 1;
        ListNode copyHead = head;
        while(copyHead.next != null) {
            copyHead = copyHead.next;
            len++;
        }
        
        copyHead.next = head;
        
        for(int i = 1; i < len - k % len; i++)
            head = head.next;
        copyHead = head.next;
        head.next = null;
        return copyHead;
    }
