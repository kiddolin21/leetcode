int total;
    public int sumNumbers(TreeNode root) {
        helper(root, 0);
        return total;
    }
    
    private void helper(TreeNode root, int sum) {
        if(root == null) return;
        
        sum = sum*10 + root.val;
        
        if(root.left == null && root.right == null) {
            total += sum;
            return;
        }
        helper(root.left, sum);
        helper(root.right, sum);
    }
