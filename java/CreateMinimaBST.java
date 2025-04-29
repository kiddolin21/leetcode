TreeNode createMinimalBST(int arr[], int start, int end) {
	if(end < start) return null;

	int mid = (start + end)/2;
	TreeNode n = new TreeNode(arr[mid]);
	n.letf = createMinimalBST(arr,start,mid-1);
	n.right = createMinimalBST(arr, mid+1,end);
	return n;
}

Tree Node createMinimalBST(int arr[]) {

	return createMinimalBST(arr,0,arr.length-1);
}
