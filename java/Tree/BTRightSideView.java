public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new LinkedList<Integer>();
        if(root == null) return res;
        helper(root, res, 0);
        return res;
    }
    
    public void helper(TreeNode root, List<Integer> res, int level) {
        if(root == null) return;
        if(res.size() - 1 < level) res.add(root.val);
        helper(root.right, res, level + 1);
        helper(root.left,res,level + 1);
    }
