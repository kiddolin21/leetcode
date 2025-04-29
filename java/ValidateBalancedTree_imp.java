public static int checkHeight(TreeNode root) {
		if(root == null) return 0;
		
		int leftHeight = checkHeight(root.left);
		if(leftHeight == -1) return -1;
		
		int rightHeight = checkHeight(root right);
		if(rightHeight == -1) return -1;
		
		int heightDiff = getHeight(root.left) - getHeight(root.right);
		if(Math.abs(heightDiff)>1) return -1;
		else {
			return Math.max(leftHeight,rightHeight) +1;
		}
	}
	
	public boolean isBalanced(TreeNode root) {
		if(checkHeight(root) == -1) return flase;
		else return true;
	}
