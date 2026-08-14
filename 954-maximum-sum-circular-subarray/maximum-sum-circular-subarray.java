class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int maxSum = nums[0];
        int minSum = nums[0];
        int currMaxSum = nums[0];
        int currMinSum = nums[0];
        int totalSum = nums[0];
        for(int i = 1;i<nums.length;i++){
            currMaxSum = Math.max(nums[i],currMaxSum + nums[i]);
            maxSum = Math.max(currMaxSum,maxSum);
            currMinSum = Math.min(nums[i],currMinSum + nums[i]);
            minSum = Math.min(currMinSum,minSum);
            totalSum += nums[i];
        }
        int circularSum = totalSum - minSum;
        if(circularSum==0) return maxSum;
        return Math.max(maxSum,circularSum);

    }
}