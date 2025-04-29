c class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode p1 = l1;
        ListNode p2 = l2;
        ListNode newHead = new ListNode(0);
        newHead.next = l1;
        ListNode pp1 = newHead;
        if(l1 == null) return l2;
        while(p1!=null && p2!=null) {
            if(p1.val<=p2.val) {
                p1 = p1.next;
                pp1 = pp1.next;
                if(p1 == null && p2 != null) {
                    pp1.next = p2;
                }
            }
            else {
                pp1.next = p2;
                ListNode temp = p2;
                p2.next = p1;
                p2 = temp.next;
            }
        }
        
        return newHead.next;
    }
}
