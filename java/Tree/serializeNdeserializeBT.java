/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {
    private String spliter = ",";
    private String NN = "X";
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root == null) return null;
        StringBuilder sb = new StringBuilder();
        serialize(root, sb);
        return sb.toString();
    }
    
    private void serialize(TreeNode root, StringBuilder sb) {
        if(root == null) {
            sb.append(NN).append(spliter);
            return;
        }
        sb.append(root.val).append(spliter);
        serialize(root.left, sb);
        serialize(root.right, sb);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data == null) return null;
        Deque<String> nodes = new LinkedList<String>();
        nodes.addAll(Arrays.asList(data.split(spliter)));
        return deserialize(nodes);
    }
    
    private TreeNode deserialize(Deque<String> nodes) {
        String val = nodes.remove();
        if(val.equals(NN)) return null;
        
        TreeNode root = new TreeNode(Integer.valueOf(val));
        root.left = deserialize(nodes);
        root.right = deserialize(nodes);
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.deserialize(codec.serialize(root));
