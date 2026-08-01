class Solution {
    private int helper(int[] nums,int left,int right){
        if(left>right) return 0;
        int pickLeft = nums[left] - helper(nums,left+1,right);
        int pickRight = nums[right] - helper(nums,left,right-1);
        return Math.max(pickLeft,pickRight);
    }
    public boolean predictTheWinner(int[] nums) {
       return helper(nums,0,nums.length-1)>=0;
    }
}