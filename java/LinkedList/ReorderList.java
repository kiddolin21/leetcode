public void reorderList(ListNode head) {
        if(head == null || head.next == null) return;
        ListNode fast = head, slow = head, prev = null;
        while(fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null;
        ListNode l2 = reverse(slow);
        merge(head, l2);
    }
    
    private ListNode reverse(ListNode head) {
        ListNode newHead = null, current = head;
        while(current != null) {
            ListNode next = current.next;
            current.next = newHead;
            newHead = current;
            current = next;
        }
        return newHead;
    }
    
    private void merge(ListNode l1, ListNode l2) {
        while(l1 != null) {
            ListNode n1 = l1.next, n2 = l2.next;
            l1.next = l2;
            if(n1 == null) break;
            l2.next = n1;
            l1 = n1;
            l2 = n2;
        }
    }
