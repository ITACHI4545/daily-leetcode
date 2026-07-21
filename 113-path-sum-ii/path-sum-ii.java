class Solution {
    List<List<Integer>> res = new ArrayList<>();
    private void fill(TreeNode root,int sum,List<Integer> temp, int targetSum){
        if(root==null) return;
        sum += root.val;
        temp.add(root.val);
        if(root.left==null && root.right==null){
            if(sum==targetSum) res.add(new ArrayList<>(temp));
        }else{
        fill(root.left,sum,temp,targetSum);
        fill(root.right,sum,temp,targetSum);
        }
        temp.remove(temp.size()-1);
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<Integer> temp = new ArrayList<>();
        fill(root,0,temp,targetSum);
        return res;
    }
}