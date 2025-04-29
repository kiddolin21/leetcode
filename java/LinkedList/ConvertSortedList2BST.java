ListNode node;
    public TreeNode sortedListToBST(ListNode head) {
        if(head == null) return null;
        
        ListNode runner = head;
        node = head;
        int size = 0;
        while(runner != null) {
            runner = runner.next;
            size++;
        }
        return helper(0, size - 1);
    }
    
    private TreeNode helper(int start, int end) {
        if(start > end) return null;
        
        int mid = (start + end) / 2;
        TreeNode left = helper(start, mid - 1);
        TreeNode root = new TreeNode(node.val);
        node = node.next;
        root.left = left;
        
        root.right = helper(mid + 1, end);
        return root;
    }
