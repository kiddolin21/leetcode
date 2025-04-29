/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class BSTIterator {
    private Stack<TreeNode> stack;
    
    public BSTIterator(TreeNode root) {
        stack = new Stack<TreeNode>();
        putAll(root);
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    /** @return the next smallest number */
    public int next() {
        TreeNode next = stack.pop();
        if(next.right != null) putAll(next.right);
        return next.val;
    }
    
    private void putAll(TreeNode node) {
        TreeNode cur = node;
        while(cur != null) {
            stack.push(cur);
            cur = cur.left;
        }
    }
}

/**
 * Your BSTIterator will be called like this:
 * BSTIterator i = new BSTIterator(root);
 * while (i.hasNext()) v[f()] = i.next();
 */
