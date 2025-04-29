public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        helper(root, res, 0);
        return res;
    }
    
    private void helper(TreeNode root, List<List<Integer>> res, int level) {
        if(root == null) return;
        if(res.size() - 1 < level) res.add(0, new ArrayList<Integer>());
        
        res.get(res.size() - 1 - level).add(root.val);
        helper(root.left, res, level + 1);
        helper(root.right, res, level + 1);
    }
