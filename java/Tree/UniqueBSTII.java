public List<TreeNode> generateTrees(int n) {
        return helper(1, n);
    }
    
    private List<TreeNode> helper(int start, int end) {
        List<TreeNode> list = new LinkedList<>();
        
        if(start > end) {
            list.add(null);
            return list;
        }
        
        for(int i = start; i<= end; i++) {
            List<TreeNode> lefts = helper(start, i - 1);
            List<TreeNode> rights = helper(i + 1, end);
            for(TreeNode left : lefts) 
                for(TreeNode right : rights) {
                    TreeNode node = new TreeNode(i);
                    node.left = left;
                    node.right = right;
                    list.add(node);
                }
        }
        return list;
    }
