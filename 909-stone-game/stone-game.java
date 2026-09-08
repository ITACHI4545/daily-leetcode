class Solution {
    int[][] dp;
    private int solve(int i,int j,int[] piles){
        if(i>j) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        int takei = piles[i] + Math.min(solve(i+2,j,piles),solve(i+1,j-1,piles));
        int takej = piles[j] + Math.min(solve(i+1,j-1,piles),solve(i,j-2,piles));
        return dp[i][j] = Math.max(takei,takej);
    }
    public boolean stoneGame(int[] piles) {
        int n = piles.length;
        int sum = 0;
        for(int num : piles){
            sum += num;
        }
        dp = new int[n][n];
        for(int[] row : dp){
        Arrays.fill(row,-1);
        }
        int aliceScore = solve(0,piles.length-1,piles);
        if(aliceScore>sum/2) return true;
        return false;
    }
}