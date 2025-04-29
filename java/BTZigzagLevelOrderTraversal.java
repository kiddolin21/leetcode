public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        helper(res,root,0);
        return res;
    }
    private void helper(List<List<Integer>> res,TreeNode root,int level) {
        if(root == null) return;
        if(res.size()<=level) {
            List<Integer> newList = new LinkedList<Integer>();
            res.add(newList);
        }
        List<Integer> collection = res.get(level);
        if(level%2 == 0) collection.add(root.val);
        else collection.add(0,root.val);
        
        helper(res,root.left,level+1);
        helper(res,root.right,level+1);
    }
