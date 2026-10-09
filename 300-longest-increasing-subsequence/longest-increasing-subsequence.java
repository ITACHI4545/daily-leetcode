class Solution {
    public int solve(int[] nums,int i,int p,int[][] dp){
        if(i>=nums.length) return 0;
        if(p!=-1 && dp[i][p]!=-1) return dp[i][p];
        int take = 0;
        if(p==-1 || nums[p]<nums[i]){
            take = 1 + solve(nums,i+1,i,dp);
        }
        int skip = solve(nums,i+1,p,dp);
        if(p!=-1){
           return dp[i][p] = Math.max(take,skip);
        }
        return Math.max(take,skip);
    }
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[][] dp = new int[n+1][n+1];
        for(int[] row : dp){
            Arrays.fill(row,-1);
        }
        int p = -1;
        return solve(nums,0,-1,dp);
       
    }
}