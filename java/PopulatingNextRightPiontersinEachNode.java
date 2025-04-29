public void connect(TreeLinkNode root) {
        
        TreeLinkNode nextLevel = root;
        
        while(nextLevel != null) {
            TreeLinkNode curr = nextLevel;
            while(curr != null && curr.left != null) {
                curr.left.next = curr.right;
                if(curr.next != null) 
                    curr.right.next = curr.next.left;
                curr = curr.next;
            }
            nextLevel = nextLevel.left;
        }
    }
