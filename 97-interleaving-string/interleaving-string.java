class Solution {
    int m;int n;int N;
    int dp [][][] = new int [101][101][201];
    public boolean solve(int i,int j,int k,String s1,String s2,String s3){
        if(i==m && j==n && k==N) return true;
        if(k>=N) return false;
        if(dp[i][j][k]!=-1){
            return dp[i][j][k]==1;
        }
        boolean result = false;
        if(i<m && s1.charAt(i)==s3.charAt(k)){
            result = solve(i+1,j,k+1,s1,s2,s3);
        }
        if(result==true){
            dp[i][j][k] = 1;
            return true;
        }
        if(j<n && s2.charAt(j)==s3.charAt(k)){
            result = solve(i,j+1,k+1,s1,s2,s3);
        }
        dp[i][j][k] = result ? 1 : 0;
        return result;
    }
    public boolean isInterleave(String s1, String s2, String s3) {
        m = s1.length();
        n = s2.length();
        N = s3.length();
        if(m+n!=N) return false;
        for(int i = 0;i<=m;i++){
            for(int j = 0;j<=n;j++){
                for(int k = 0;k<=N;k++){
                    dp[i][j][k] = -1;
                }
            }
        }
        return solve(0,0,0,s1,s2,s3);
    }
}