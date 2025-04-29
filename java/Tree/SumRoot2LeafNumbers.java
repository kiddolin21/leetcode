public int sumNumbers(TreeNode root) {
        if(root == null) return 0;
        return helper(root, 0, 0);
    }
    
    private int helper(TreeNode root, int sum, int res) {
        sum = sum * 10 + root.val;
        if(root.left == null && root.right == null) {
            res += sum;
            return res;
        }
        if(root.left != null) res = helper(root.left, sum, res);
        if(root.right != null) res = helper(root.right, sum, res);
        return res;
    }
