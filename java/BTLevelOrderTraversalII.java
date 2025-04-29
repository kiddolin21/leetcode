public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        helper(root, res, 0);
        return res;
    }
    
    private void helper(TreeNode root, List<List<Integer>> res, int level) {
        if(root == null) return;
        if(res.size() < level + 1) res.add(0, new ArrayList<Integer>());
        res.get(res.size() - level - 1).add(root.val);
        helper(root.left, res, level + 1);
        helper(root.right, res, level + 1);
    }
