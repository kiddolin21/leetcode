public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0) return null;
        int n = lists.length;
        PriorityQueue<ListNode> queue = new PriorityQueue<ListNode>(n,
            new Comparator<ListNode>() {
           @Override
           public int compare(ListNode n1, ListNode n2) {
               return n1.val - n2.val;
           }
        });
        
        for(ListNode node: lists) {
            if(node != null) queue.add(node);
        }
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;
        while(!queue.isEmpty()) {
            ListNode node = queue.poll();
            current.next = node;
            current = current.next;
            if(node.next != null) queue.add(node.next);
        }
        return dummy.next;
    }
