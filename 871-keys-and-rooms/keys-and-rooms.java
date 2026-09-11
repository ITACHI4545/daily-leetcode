class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[n];
        int start = 0;
        q.add(start);
        visited[start]=true;
        while(!q.isEmpty()){
            int front = q.poll();
            for(int x : rooms.get(front)){
                if(!visited[x]){
                    q.add(x);
                    visited[x]=true;
                }
            }
        }
        for(int i = 0;i<visited.length;i++){
            if(visited[i]==false) return false;
        }
        return true;
    }
}