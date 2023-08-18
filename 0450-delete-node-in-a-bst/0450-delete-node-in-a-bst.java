/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null) return root;
        if(root.val>key){
            root.left = deleteNode(root.left,key);
            return root;
        } else if(root.val<key){
            root.right = deleteNode(root.right,key);
            return root;
        }

        if(root.left==null){
            TreeNode temp = root.right;
            return temp;
        } else if(root.right==null){
            TreeNode temp = root.left;
            return temp;
        }
        else{
            TreeNode successorParent = root;
            TreeNode successor = root.right;
            while(successor.left!=null){
                successorParent = successor;
                successor = successor.left;
            }

            if(successorParent != root){
                successorParent.left = successor.right;
            }else{
                successorParent.right = successor.right;
            }

            root.val = successor.val;

            return root;
        }
    }
}