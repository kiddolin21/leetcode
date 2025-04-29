public ListNode sortList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode fast = head, slow = head, prev = null;
        while(fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode second = prev.next;
        prev.next = null;
        ListNode first = sortList(head);
        second = sortList(second);
        head = merge(first, second);
        return head;
    }
    
    private ListNode merge(ListNode first, ListNode second) {
        ListNode dummyHead = new ListNode(0), merged = dummyHead;
        while(first != null && second != null) {
            if(first.val <= second.val) {
                merged.next = first;
                merged = merged.next;
                first = first.next;
            } else {
                merged.next = second;
                merged = merged.next;
                second = second.next;
            }
        }
        if(first != null) merged.next = first;
        if(second != null) merged.next = second;
        
        return dummyHead.next;
    }
