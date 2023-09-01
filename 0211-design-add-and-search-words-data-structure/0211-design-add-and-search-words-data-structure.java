class TrieNode{
    public HashMap<Character,TrieNode> children;
    public boolean endOfWord;
    public TrieNode(){
        children = new HashMap<>();
        endOfWord = false;
    }
}

class WordDictionary {
    private TrieNode root; 
    public WordDictionary() {
        root = new TrieNode();
    }
    
    public void addWord(String word) {
        TrieNode cur = root;
        for(char c : word.toCharArray()){
            if(!cur.children.containsKey(c)){
                cur.children.put(c,new TrieNode());
            }
            cur = cur.children.get(c);
        }
        cur.endOfWord = true;
    }
    
    public boolean search(String word) {
    return searchRecursive(root, word, 0);
}

private boolean searchRecursive(TrieNode node, String word, int index) {
    if (node == null) {
        return false;
    }

    if (index == word.length()) {
        return node.endOfWord;
    }

    char c = word.charAt(index);

    if (c == '.') {
        // If the character is a dot, try all possible child nodes
        for (TrieNode child : node.children.values()) {
            if (searchRecursive(child, word, index + 1)) {
                return true;
            }
        }
    } else {
        // If the character is not a dot, proceed with the specific child
        if (!node.children.containsKey(c)) {
            return false;
        }
        return searchRecursive(node.children.get(c), word, index + 1);
    }

    return false;
}

}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */