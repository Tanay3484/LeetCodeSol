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

    StringBuilder sb = new StringBuilder();

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        preorderTraversal(root);
        return sb.toString();
    }

    public void preorderTraversal(TreeNode root){
        if(root==null){
            sb.append("n ");
            return;
        }
        sb.append(root.val+" ");
        preorderTraversal(root.left);
        preorderTraversal(root.right);
    }

    int index = 0;

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] ss = data.split(" ");
        return prebuild(ss);
    }

    public TreeNode prebuild(String[] ss){
        if(index>=ss.length) return null;
        if(ss[index].equals("n")) return null;
        TreeNode node = new TreeNode(Integer.parseInt(ss[index]));
        index++;
        node.left = prebuild(ss);
        index++;
        node.right = prebuild(ss);
        return node;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));