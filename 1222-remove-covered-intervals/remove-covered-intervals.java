class Solution {
    public int removeCoveredIntervals(int[][] interval) {
        int n = interval.length;
        int remaining = n;
        boolean[] isCovered = new boolean[n];

        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                if(i!=j && !isCovered[i]){
                    if(interval[j][0]<=interval[i][0] && interval[i][1]<=interval[j][1]){
                    isCovered[i]=true;
                    remaining--;
                    break;
                    }
                }
            }
        }
        return remaining;
    }
}