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
    public int kthSmallest(TreeNode root, int k) {
        if(root==null) return 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        List<Integer> nums = new ArrayList<Integer>();
        while(!q.isEmpty()){
            TreeNode curr = q.poll();
            nums.add(curr.val);
            if(curr.right!=null) q.offer(curr.right);
            if(curr.left!=null) q.offer(curr.left);
        }
        Collections.sort(nums);
        return nums.get(k-1);
    }
}