class Solution {
    private void dfs(int row,int col,char[][] grid){
            int m = grid.length;
            int n = grid[0].length;
            if(row<0 || row>=m || col<0 || col>=n || grid[row][col]=='0') return;
            grid[row][col]='0';
            int[] dirs = {-1,0,1,0,-1};
            for(int d = 0;d<4;d++){
                int nr = row + dirs[d];
                int nc = col + dirs[d+1];
                dfs(nr,nc,grid);
            }
    }
    public int numIslands(char[][] grid) {
        int count = 0;
        for(int i = 0;i<grid.length;i++){
            for(int j = 0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    dfs(i,j,grid);
                    count++;
                }
            }
        }
        return count;
    }
}