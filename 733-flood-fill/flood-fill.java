class Solution {
    private void dfs(int[][] image,int i,int j,int color,int orgC){
        int m = image.length;
        int n = image[0].length;
        if(i<0 || i>=m || j<0 || j>=n) return;
        if(image[i][j]!=orgC) return;
        image[i][j]=color;
        dfs(image,i+1,j,color,orgC);
        dfs(image,i-1,j,color,orgC);
        dfs(image,i,j+1,color,orgC);
        dfs(image,i,j-1,color,orgC);
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int orgC = image[sr][sc];
        if(orgC==color) return image;
        dfs(image,sr,sc,color,orgC);
        return image;
    }
}