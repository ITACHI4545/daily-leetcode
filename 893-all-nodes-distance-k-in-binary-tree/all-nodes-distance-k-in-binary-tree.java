class Solution {
     HashMap<TreeNode,TreeNode> parentMap = new HashMap<>();
    private void mapParents(TreeNode node,TreeNode parent){
        if(node==null) return;
        parentMap.put(node,parent);
        mapParents(node.left,node);
        mapParents(node.right,node);
    }
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
       mapParents(root,null);
       Queue<TreeNode> queue = new LinkedList<>();
       Set<TreeNode> visited = new HashSet<>();
       queue.offer(target);
       visited.add(target);
       int currDist = 0;
       while(!queue.isEmpty()){
            if(currDist==k) break;
            int size = queue.size();
            for(int i = 0;i<size;i++){
                TreeNode curr = queue.poll();
                if(curr.left!=null && !visited.contains(curr.left)){
                    queue.offer(curr.left);
                    visited.add(curr.left);
                }
                if(curr.right!=null && !visited.contains(curr.right)){
                    queue.offer(curr.right);
                    visited.add(curr.right);
                }
                TreeNode parent = parentMap.get(curr);
                if(parent!=null && !visited.contains(parent)){
                    queue.offer(parent);
                    visited.add(parent);
                }
            }
            currDist++;
       }
       List<Integer> res = new ArrayList<>();
       while(!queue.isEmpty()){
        res.add(queue.poll().val);
       }
       return res;
    }
}