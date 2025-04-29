public class BSTIterator {
    TreeNode root;
    Stack<TreeNode> stack;

    public BSTIterator(TreeNode root) {
        this.root = root;
        stack = new Stack<TreeNode>();
        TreeNode curr = root;
        while(curr != null) {
            stack.push(curr);
            curr = curr.left;
        }
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    /** @return the next smallest number */
    public int next() {
        TreeNode node = stack.pop();
        if(node.right != null) {
            TreeNode curr = node.right;
            while(curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
        }
        return node.val;
    }
}
