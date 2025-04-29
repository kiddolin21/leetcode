public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0) return null;
        return mergeKLists(lists, 0, lists.length - 1);
    }
    
    private ListNode mergeKLists(ListNode[] lists, int start, int end) {
        if(start == end) return lists[start];
        int mid = (start + end) / 2;
        ListNode l1 = mergeKLists(lists, start, mid);
        ListNode l2 = mergeKLists(lists, mid + 1, end);
        ListNode l = merge(l1,l2);
        return l;
    }
    private ListNode merge(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1), current = dummy;
        while(l1 != null && l2 != null) {
            if(l1.val < l2.val) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }
        if(l1 != null) current.next = l1;
        if(l2 != null) current.next = l2;
        return dummy.next;
    }
