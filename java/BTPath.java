public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<String>();
        helper(res, new StringBuilder(), root);
        return res;
    }
    
    private void helper(List<String> res, StringBuilder sb, TreeNode root) {
        if(root == null) return;
        int len = sb.length();
        sb.append(root.val + "->");
        if(root.left != null) helper(res, sb, root.left);
        if(root.right != null) helper(res, sb, root.right);
        if(root.left == null && root.right == null) {
            sb.delete(sb.length() - 2, sb.length());
            res.add(sb.toString());
        }
        sb.delete(len, sb.length());
        return;
    }
