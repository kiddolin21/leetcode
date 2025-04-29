public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;
        helper(root, res, 0);
        return res;
    }
    
    private void helper(TreeNode root, List<List<Integer>> res, int level) {
        if(root == null) return;
        
        if(res.size() - 1 < level) res.add(new ArrayList<Integer>());
        if(level % 2 == 0) res.get(level).add(root.val);
        else res.get(level).add(0, root.val);
        
        helper(root.left, res, level + 1);
        helper(root.right, res, level + 1);
    }
