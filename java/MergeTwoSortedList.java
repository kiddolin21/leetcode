c class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode newHead = new ListNode(0);
        ListNode temp = newHead;
        while(l2!=null) {
            if(l1 == null) {
                l1 = l2;
                break;
            }
            else if(l1.val<l2.val) {
                temp = temp.next = l1;
                l1 = l1.next;
            }
            else {
                temp = temp.next = l2;
                l2 = l2.next;
            }
        }
        temp.next = l1;
        return newHead.next;
    }
}
