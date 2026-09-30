class Solution {
    private int[] getLeftMax(int[] height,int n){
        int[] leftmax = new int[height.length];
        leftmax[0] = height[0];
        for(int i = 1;i<height.length;i++){
            leftmax[i] = Math.max(height[i],leftmax[i-1]);
        }
        return leftmax;
    }
    private int[] getRightMax(int[] height,int n){
        int[] rightmax = new int[height.length];
        rightmax[n-1] = height[n-1];
        for(int i = n-2;i>=0;i--){
            rightmax[i] = Math.max(height[i],rightmax[i+1]);
        }
        return rightmax;
    }
    public int trap(int[] height) {
        int n = height.length;
        int[] leftmax = getLeftMax(height,n);
        int[] rightmax = getRightMax(height,n);
        int sum = 0;
        for(int i = 0;i<n;i++){
            int h = Math.min(leftmax[i],rightmax[i])-height[i];
            sum += h;
        }
        return sum;
    }
}