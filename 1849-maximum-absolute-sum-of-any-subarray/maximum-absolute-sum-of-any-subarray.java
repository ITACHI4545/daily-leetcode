class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int currMaxSum=nums[0]; 
        int currMinSum=nums[0]; 
        int maxAbsSum=Math.abs(nums[0]); 
        for(int i=1;i<nums.length;i++){
            currMaxSum+=nums[i]; 
            currMinSum+=nums[i]; 
            currMaxSum=Math.max(currMaxSum,nums[i]);
            currMinSum=Math.min(currMinSum,nums[i]);
            maxAbsSum=Math.max(maxAbsSum,Math.max(Math.abs(currMinSum),Math.abs(currMaxSum)));
        }
        return maxAbsSum;
    }
}