class Solution {
    private void dfs(int node, List<List<Integer>> adj,boolean[] visited,int[] counts){
        visited[node] = true;
        counts[0]++;
        counts[1] += adj.get(node).size();

        for(int neigh : adj.get(node)){
            if(!visited[neigh]){
                dfs(neigh,adj,visited,counts);
            }
        }
    }
    public int countCompleteComponents(int n, int[][] edges) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i = 0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] edge : edges){
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }
        boolean[] visited = new boolean[n];
        int completeCount = 0;
        for(int i = 0;i<n;i++){
            if(!visited[i]){
                int[] counts = new int[2];
                dfs(i,adj,visited,counts);
                if(counts[1]==counts[0]*(counts[0]-1)){
                    completeCount++;
                }
            }
        }
        return completeCount;
    }
}