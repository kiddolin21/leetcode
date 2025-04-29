public TreeNode buildTree(int[] preorder, int[] inorder) {
        return BuildTree(preorder,inorder,0,0,preorder.length);
        
    }
    public TreeNode BuildTree(int[] preorder,int[] inorder,int preIndex,int inIndex,int size) {
        if(size<=0) return null;
        
        TreeNode rv = new TreeNode(preorder[preIndex]);
        
        for(int i=0;i<size;i++) {
            if(preorder[preIndex] == inorder[inIndex+i]) {
                rv.left = BuildTree(preorder,inorder,preIndex+1,inIndex,i);
                rv.right = BuildTree(preorder,inorder,preIndex+i+1,inIndex+i+1,size-i-1);
                break;
            }
        }
        return rv;
    }
