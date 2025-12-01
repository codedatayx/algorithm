class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root == null){
            return null;
        }
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        root.left= right;
        root.right = left;
        return root; // 返回根节点
    }
}

///////////////


class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root == null){
            return null;
        }
        TreeNode x = root.left;
        root.left = root.right;
        root.right = x;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}
