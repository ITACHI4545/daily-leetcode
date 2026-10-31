class Solution {
    int left = 0;
    int up = 1;
    int mod = 1000000007;
    int m;
    int n;
    public int solve(int[][] grid,int i,int j,int cameFrom,int[][][] dp){
        if(i>=m || j>=n) return 0;
        if(i==m-1 && j==n-1) return 1;
        if(dp[i][j][cameFrom]!=-1) return dp[i][j][cameFrom];
        if(grid[i][j]==1){
            if(cameFrom==left){
                return dp[i][j][cameFrom] = solve(grid,i+1,j,up,dp);
            }else return dp[i][j][cameFrom] = solve(grid,i,j+1,left,dp);
        }
        int totalPaths = 0;
        totalPaths = (totalPaths + solve(grid, i + 1, j, up, dp)) % mod;
        totalPaths = (totalPaths + solve(grid, i, j + 1, left, dp)) % mod;
        return dp[i][j][cameFrom] = totalPaths;
        }
    public int uniquePaths(int[][] grid) {
        m = grid.length;
        n = grid[0].length;
        int[][][] dp = new int[m][n][2];
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                dp[i][j][0] = -1;
                dp[i][j][1] = -1;
            }
        }
        return solve(grid,0,0,left,dp);
    }
}