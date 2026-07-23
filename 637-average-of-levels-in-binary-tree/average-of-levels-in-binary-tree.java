class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> res = new ArrayList<>();
        if(root==null) return res;

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty()){
            int size = q.size();
            double levelSum = 0;

            for(int i = 0;i<size;i++){
                TreeNode curr = q.poll();
                levelSum += curr.val;

                if(curr.left!=null) q.offer(curr.left);
                if(curr.right!=null) q.offer(curr.right);
            }
            res.add(levelSum/size);
        }
        return res;
    }
}