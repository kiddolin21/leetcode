public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenthA = 0, lenthB = 0;
        ListNode runner = headA;
        while(runner != null) {
            lenthA ++;
            runner = runner.next;
        }
        runner = headB;
        while(runner != null) {
            lenthB ++;
            runner = runner.next;
        }
        int diff = Math.abs(lenthA - lenthB);
        runner = (lenthA > lenthB)? headA : headB;
        ListNode runner2 = (lenthA > lenthB)? headB : headA;
        while(diff != 0) {
            runner = runner.next;
            diff --;
        }
        while(runner != null && runner2 != null) {
            if(runner == runner2) return runner;
            runner = runner.next;
            runner2 = runner2.next;
        }
        
        return null;
    }
