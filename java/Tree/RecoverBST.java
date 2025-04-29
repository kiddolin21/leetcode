private TreeNode firstNode = null;
    private TreeNode secondNode = null;
    private TreeNode prev = new TreeNode(Integer.MIN_VALUE);
    public void recoverTree(TreeNode root) {
        if(root == null) return;
        findTwoNodes(root);
        
        int tmp = firstNode.val;
        firstNode.val = secondNode.val;
        secondNode.val = tmp;
        
    }
    private void findTwoNodes(TreeNode root) {
        if(root == null) return;
        findTwoNodes(root.left);
        
        if(firstNode == null && prev.val >= root.val) 
            firstNode = prev;
        if(firstNode != null && prev.val >= root.val)
            secondNode = root;
        prev = root;
        findTwoNodes(root.right);
    }
