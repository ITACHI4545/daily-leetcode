class Solution {
    private int helper(int i,int j,String s,String rev,int[][] dp){
        if(i<0 || j<0) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        if(s.charAt(i)==rev.charAt(j)){
            return dp[i][j] = 1 + helper(i-1,j-1,s,rev,dp);
        }else{
            return dp[i][j] = Math.max(helper(i-1,j,s,rev,dp),helper(i,j-1,s,rev,dp));
        }
    }
    public int longestPalindromeSubseq(String s) {
        String rev = new StringBuilder(s).reverse().toString();
        int m = s.length();
        int n = rev.length();
        int[][] dp = new int[m][n];
        for(int[] row : dp) Arrays.fill(row,-1);
        return helper(m-1,n-1,s,rev,dp);
    }
}