class Solution {
    public boolean helper(String s,int i,int j, Boolean[][] dp){
        if(i>=j) return true;
        if(dp[i][j]!=null) return dp[i][j];
        if(s.charAt(i)==s.charAt(j)){
            dp[i][j] = helper(s,i+1,j-1,dp);
        }else{
            dp[i][j] = false;
        }
        return dp[i][j];
    }
    public String longestPalindrome(String s) {
        int n = s.length();
        int start = 0;
        int maxLen = Integer.MIN_VALUE;
        Boolean[][] dp = new Boolean[n][n];
        for(int i = 0;i<n;i++){
            for(int j = i;j<n;j++){
                if(helper(s,i,j,dp)){
                    if(j-i+1>maxLen){
                        maxLen = j-i+1;
                        start = i;
                    }
                }
            }
        }
        return s.substring(start,start+maxLen);
    }
}