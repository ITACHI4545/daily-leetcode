class Solution {
    private void dfs(int i,int[][] graph, List<Integer> path, List<List<Integer>> res){
        path.add(i);
        if(i==graph.length-1) res.add(new ArrayList<>(path));
        else{
            for(int neigh : graph[i]){
                dfs(neigh,graph,path,res);
            }
        }
        path.remove(path.size()-1);
    }
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        int n = graph.length;
        List<Integer> path = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        dfs(0,graph,path,res);
        return res;
    }
}