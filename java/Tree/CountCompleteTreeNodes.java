public int countNodes(TreeNode root) {
        int h = getHeight(root), node = 0;
        while(root != null) {
            if(getHeight(root.right) == h - 1) {
                node += (1 << h);
                root = root.right;
            } else {
                node += (1 << (h - 1));
                root = root.left;
            }
            h--;
        }
        return node;
    }
    
    private int getHeight(TreeNode root) {
        return (root == null)? -1 : 1 + getHeight(root.left);
    }
