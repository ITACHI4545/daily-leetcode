class Solution {
    private int left(TreeNode root){
        TreeNode temp = root;
        int lh = 0;
        while(temp!=null){
            temp = temp.left;
            lh++;
        }
        return lh;
    }
    private int right(TreeNode root){
        TreeNode temp = root;
        int rh = 0;
        while(temp!=null){
            temp = temp.right;
            rh++;
        }
        return rh;
    }
    public int countNodes(TreeNode root) {
        if(root==null) return 0;
        int lh = left(root);
        int rh = right(root);
        if(lh==rh) return (int)Math.pow(2,lh)-1;
        return countNodes(root.left) + countNodes(root.right) + 1;
    }
}