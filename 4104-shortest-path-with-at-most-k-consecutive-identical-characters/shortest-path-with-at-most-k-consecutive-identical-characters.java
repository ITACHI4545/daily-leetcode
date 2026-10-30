class Solution {
    public int shortestPath(int n, int[][] edges, String labels, int k) {
        Map<Integer,List<int[]>> adj = new HashMap<>();
        for(int[] edge : edges){
            int u = edge[0];
            int v = edge[1];
            int wt = edge[2];
            adj.computeIfAbsent(u,x -> new ArrayList<>()).add(new int[]{v,wt});
        }
        int[][] dist = new int[n][k+1];
        for(int[] row : dist){
            Arrays.fill(row,Integer.MAX_VALUE);
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->a[0]-b[0]);
        dist[0][1] = 0;
        pq.offer(new int[]{0,0,1});
        while(!pq.isEmpty()){
            int[] current = pq.poll();
            int currentDist = current[0];
            int node = current[1];
            int count = current[2];

            if(currentDist>dist[node][count]) continue;
            if(node == n-1) return currentDist;
            if(!adj.containsKey(node)) continue;
            for(int[] neighbor : adj.get(node)){
                int adjNode = neighbor[0];
                int weight = neighbor[1];
                int newCount = (labels.charAt(adjNode)==labels.charAt(node)) ? count + 1 : 1;
                if(newCount>k) continue;
                int newDist = currentDist + weight;
                if(newDist<dist[adjNode][newCount]){
                    dist[adjNode][newCount] = newDist;
                    pq.offer(new int[]{newDist,adjNode,newCount});
                }
            }
        }
        return -1;
    }
}