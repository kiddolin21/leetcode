public RandomListNode copyRandomList(RandomListNode head) {
        if(head == null) return null;
        Map<RandomListNode, RandomListNode> map = new HashMap<>();
        RandomListNode p = head;
        RandomListNode dummyHead = new RandomListNode(0);
        RandomListNode q = dummyHead;
        
        while(p != null) {
            q.next = new RandomListNode(p.label);
            map.put(p, q.next);
            p = p.next;
            q = q.next;
        }
        q = dummyHead.next;
        p = head;
        while(q != null) {
            q.random = map.get(p.random);
            q = q.next;
            p = p.next;
        }
        return dummyHead.next;
    }
