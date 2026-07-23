class Solution {
    private void helper(TreeNode node,List<Integer> leafValues){
        if(node.left == null && node.right == null){
            leafValues.add(node.val);
            return;
        }
        if(node.left!=null){
            helper(node.left,leafValues);
        }
        if(node.right!=null){
            helper(node.right,leafValues);
        }
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> leftV = new ArrayList<>();
        List<Integer> rightV = new ArrayList<>();
        helper(root1,leftV);
        helper(root2,rightV);
        return leftV.equals(rightV);
    }
}