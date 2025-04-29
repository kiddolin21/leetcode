public TreeNode buildTree(int[] preorder, int[] inorder) {
        return helper(preorder, inorder, 0, 0, preorder.length);
    }
    
    private TreeNode helper(int[] preorder, int[] inorder, int preIndex, int inIndex, int size) {
        if(size <= 0) return null;
        
        TreeNode node = new TreeNode(preorder[preIndex]);
    
        for(int i = 0; i < size; i++) {
            if(preorder[preIndex] == inorder[inIndex + i]) {
                node.left = helper(preorder, inorder, preIndex + 1, inIndex, i);
                node.right = helper(preorder, inorder, preIndex + i + 1, inIndex + i + 1, size - 1 - i);
                break;
            }
        }
        return node;
    }
