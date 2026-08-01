class Solution {
    private int helper(int[] nums,int left,int right,Integer[][] memo){
        if(left>right) return 0;
        if(memo[left][right]!=null) return memo[left][right];
        int pickLeft = nums[left] - helper(nums,left+1,right,memo);
        int pickRight = nums[right] - helper(nums,left,right-1,memo);
        return Math.max(pickLeft,pickRight);
    }
    public boolean predictTheWinner(int[] nums) {
        Integer[][] memo = new Integer[nums.length][nums.length];
       return helper(nums,0,nums.length-1,memo)>=0;
    }
}