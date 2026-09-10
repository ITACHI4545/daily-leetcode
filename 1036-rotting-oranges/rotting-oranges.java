class Pair{
    int row;
    int col;
    Pair(int row,int col){
        this.row = row;
        this.col = col;
    }
}
class Solution {
    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int count = 0;
        Queue<Pair> q = new LinkedList<>();
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(grid[i][j]==0) continue;
                else if(grid[i][j]==1) count++;
                else q.add(new Pair(i,j));
            }
        }
        int ans = 0;
        int[] dir = {-1,0,1,0,-1};
        if(count==0) return ans;
        while(!q.isEmpty()){
            boolean rotted = false;
            int size = q.size();
            for(int i = 0;i<size;i++){
                Pair p = q.poll();
                int r = p.row;
                int c = p.col;
                for(int d = 0;d<4;d++){
                    int nr = r + dir[d];
                    int nc = c + dir[d+1];
                    if(nr>=0 && nr<m && nc>=0 && nc<n && grid[nr][nc]==1){
                        grid[nr][nc]=2;
                        rotted=true;
                        q.add(new Pair(nr,nc));
                        count--;
                    }
                }
            }
            if(rotted) ans++;
        }
        if(count==0) return ans;
        return -1;
    }
}