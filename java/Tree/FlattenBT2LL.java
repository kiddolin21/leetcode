public void flatten(TreeNode root) {
        if(root == null) return;
        
        TreeNode left = root.left;
        TreeNode right = root.right;
        
        flatten(left);
        flatten(right);
        
        root.left = null;
        root.right = left;
        
        TreeNode curr = root;
        while(curr.right != null) curr = curr.right;
        curr.right = right;
    }
