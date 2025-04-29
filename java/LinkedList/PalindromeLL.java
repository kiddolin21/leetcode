public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) return true;
        ListNode fast = head, slow = head, prev = null;
        while(fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null;
        ListNode second = reverse(slow);
        while(head != null && second != null) {
            if(head.val != second.val) return false;
            head = head.next;
            second = second.next;
        }
        return true;
    }
    
    private ListNode reverse(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode newHead = null, current = head;
        while(current != null) {
            ListNode next = current.next;
            current.next = newHead;
            newHead = current;
            current = next;
        }
        return newHead;
    }
