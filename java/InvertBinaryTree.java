public TreeNode invertTree(TreeNode root) {
        helper(root);
        return root;
    }
    
    private void helper(TreeNode node) {
        if(node == null) return;
        TreeNode tmp = node.left;
        node.left = node.right;
        node.right = tmp;
        helper(node.left);
        helper(node.right);
    }
