public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null) return false;
        if(root.left == null && root.right == null) return root.val == sum;
        
        return hasPathSum(root.right, sum - root.val) || hasPathSum(root.left, sum - root.val);
    }
