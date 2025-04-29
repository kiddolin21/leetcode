public ListNode swapPairs(ListNode head) {
        if(head == null) return null;
        if(head.next == null) return head;
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        while(head != null && head.next != null) {
            ListNode next = head.next.next;
            current.next = head.next;
            head.next.next = head;
            head.next = next;
            current = head;
            head = next;
        }
        return dummyHead.next;
    }
