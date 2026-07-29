class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int i = 0;
        int j = n-1;
        int area = 0;
        while(i<j){
            int currWidth = j-i;
            int currHeight = Math.min(height[i],height[j]);
            int currArea = currWidth * currHeight;
            area = Math.max(area,currArea);
            if(height[i]<height[j]) i++;
            else j--;
        }
        return area;
    }
}