private TreeNode prev;
    public boolean isValidBST(TreeNode root) {
        prev = null;
        return isIncreasing(root);
    }
    
    private boolean isIncreasing(TreeNode t) {
        if(t == null) return true;
        if(isIncreasing(t.left)) {
            if(prev != null && t.val <= prev.val) return false;
        prev = t;
        return isIncreasing(t.right);
        }
        return false;
    }
