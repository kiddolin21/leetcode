public TreeNode buildTree(int[] inorder, int[] postorder) {
        return helper(inorder, postorder, inorder.length - 1, postorder.length - 1, inorder.length);
    }
    
    private TreeNode helper(int[] inorder, int[] postorder, int inIndex, int poIndex, int size) {
        if(poIndex < 0 || size <= 0) return null;
        
        TreeNode node = new TreeNode(postorder[poIndex]);
        for(int i = size - 1; i >= 0; i--) {
            if(postorder[poIndex] == inorder[inIndex - i]) {
                node.right = helper(inorder, postorder, inIndex, poIndex - 1, i);
                node.left = helper(inorder, postorder, inIndex - i - 1, poIndex - i - 1, size - 1 - i);
                break;
            }
        }
        return node;
    }
