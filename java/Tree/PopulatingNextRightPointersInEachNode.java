public void connect(TreeLinkNode root) {
        TreeLinkNode levelStart = root;
        
        while(levelStart != null) {
            TreeLinkNode curr = levelStart;
            while(curr != null && curr.left != null) {
                curr.left.next = curr.right;
                if(curr.next != null) {
                    curr.right.next = curr.next.left;
                }
                curr = curr.next;
            }
            levelStart = levelStart.left;
        }
    }
