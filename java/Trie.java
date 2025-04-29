class TrieNode {
    TrieNode[] children;
     String item;
    public TrieNode() {
        children = new TrieNode[26];
        item = "";
    }
}

public class Trie {
    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode node = root;
        for(char c : word.toCharArray()) {
            if(node.children[c - 'a'] == null)
                node.children[c - 'a'] = new TrieNode();
            node = node.children[c - 'a'];
        }
        node.item = word;
    }

    public boolean search(String word) {
        return isMatch(word.toCharArray(), 0, root, false);
    }

    public boolean startsWith(String prefix) {
        return isMatch(prefix.toCharArray(), 0, root, true);
    }
    
    private boolean isMatch(char[] chrs, int k, TrieNode node, boolean isPre) {
        if(k == chrs.length) {
            if(!isPre) return !node.item.equals("");
            else return true;
        }
        if(chrs[k] != '.') { 
            return node.children[chrs[k] - 'a'] != null && isMatch(chrs, k + 1, node.children[chrs[k] - 'a'],isPre);
        } else {
            for(int i = 0; i < 26; i++) {
                if (node.children[i] != null) 
                    if(isMatch(chrs, k + 1, node.children[i], isPre)) return true;
            }
        }
        return false;
    }
}
