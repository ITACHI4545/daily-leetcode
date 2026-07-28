class Solution {
    private int[][] directions = {{-2,-1},{-2,1},{-1,-2},{-1,2},{1,-2},{1,2},{2,-1},{2,1}};
    private Double[][][] memo;
    private double helper(int i,int j,int n,int k){
        if(i<0 || i>=n || j<0 || j>=n) return 0.0;
        if(k==0) return 1.0;
        if(memo[i][j][k]!=null) return memo[i][j][k];
        double prob = 0.0;
        for(int[] dir : directions){
            int nr = i + dir[0];
            int nc = j + dir[1];
            prob += 0.125 * helper(nr,nc,n,k-1);
        }
        memo[i][j][k] = prob;
        return prob;
    }
    public double knightProbability(int n, int k, int row, int column) {
        memo = new Double[n][n][k+1];
        return helper(row,column,n,k);
    }
}