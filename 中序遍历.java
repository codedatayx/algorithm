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
    public List s1 = new ArrayList<>();
    public void inorderTraversal1(TreeNode root){
        if(root == null){
            return;
        }
        inorderTraversal(root.left);
        s1.add(root.val);
        inorderTraversal(root.right);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        inorderTraversal1(root);
        return s1;
    }
}
