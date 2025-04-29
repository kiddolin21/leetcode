c class Solution {
    public void reorderList(ListNode head) {
        if(head != null) {
            int num = 0;
            ListNode temp = head;
            while(temp!=null) num++;
            for(int i=0;i<num/2;i+=2) {
                ListNode former = getNode(i,head);
                ListNode later = getNode(num,head);
                temp = former;
                former.next = later;
                later.next = temp.next;
            }
            getNode(num,head).next = null;
        }
    }
    
    public ListNode getNode(int i,ListNode head) {
        ListNode current = head;
        while(i!=0) {
            current = current.next;
            i--;
        }
        return current;
    }
}
