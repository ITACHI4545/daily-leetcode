class Solution {
    private int helper(TreeNode root){
        if(root==null) return 0;
        return 1+Math.max(helper(root.left),helper(root.right));
    }
    public int maxDepth(TreeNode root) {
        return helper(root);
    }
}