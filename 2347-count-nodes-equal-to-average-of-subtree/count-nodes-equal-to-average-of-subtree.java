class Solution {
    private int count = 0;
    private int[] dfs(TreeNode root){
        if(root==null) return new int[]{0,0};
        int[] left = dfs(root.left);
        int[] right = dfs(root.right);
        int currSum = root.val + left[0] + right[0];
        int currCount = 1 + left[1] + right[1];
        if(currSum/currCount==root.val){
            count++;
        }
        return new int[]{currSum,currCount};
    }
    public int averageOfSubtree(TreeNode root) {
        dfs(root);
        return count;
    }
}