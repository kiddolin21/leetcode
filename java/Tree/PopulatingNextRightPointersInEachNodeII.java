public void connect(TreeLinkNode root) {
        TreeLinkNode pre = null, head = null, cur = root;
        while(cur != null) {
            while(cur != null) {
                if(cur.left != null) {
                    if(pre != null) pre.next = cur.left;
                    else head = cur.left;
                    pre = cur.left;
                }
                
                if(cur.right != null) {
                    if(pre != null) pre.next = cur.right;
                    else head = cur.right;
                    pre = cur.right;
                }
                cur = cur.next;
            }
            cur = head;
            pre = null;
            head = null;
        }
    }
