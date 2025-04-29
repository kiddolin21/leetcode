List<Integer> res = new ArrayList<Integer>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root == null) return res;
        res.add(root.val);
        
        res = preorderTraversal(root.left);
        res = preorderTraversal(root.right);
        
        return res;
    }
