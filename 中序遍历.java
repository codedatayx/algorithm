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
//迭代
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> s1 = new ArrayList<>();
        Deque<TreeNode> stk = new LinkedList<TreeNode>();
        while (root != null || !stk.isEmpty()){
            while(root!=null){
                stk.push(root);
                root = root.left;
            }
            root = stk.pop();
            s1.add(root.val);
            root = root.right;
        }
        return s1;
    }
}
