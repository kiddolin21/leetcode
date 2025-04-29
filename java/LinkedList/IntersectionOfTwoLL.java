public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) return null;
        ListNode a = headA, b = headB;
        int lenA = getLen(headA);
        int lenB = getLen(headB);
        int diff = Math.abs(lenA - lenB);
        if(lenA > lenB) {
            while(diff-- > 0) a = a.next;
        } else {
            while(diff-- > 0) b = b.next;
        }
        while(a != null && b != null) {
            if(a == b) return a;
            a = a.next;
            b = b.next;
        }
        return null;
    }
    
    private int getLen(ListNode head) {
        int len = 0;
        ListNode p = head;
        while(p != null) {
            p = p.next;
            len++;
        }
        return len;
    }
