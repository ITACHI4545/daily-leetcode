class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long maxSum = 0;
        long currSum = 0;
        int[] freq = new int[100001];
        int duplicates = 0;
        for(int i = 0;i<k;i++){
            currSum += nums[i];
            freq[nums[i]]++;
            if(freq[nums[i]]==2){
                duplicates++;
            }
        }
        if(duplicates==0){
            maxSum = currSum;
        }
        for(int i = k;i<nums.length;i++){
            currSum += nums[i];
            freq[nums[i]]++;
            if(freq[nums[i]]==2){
                duplicates++;
            }
            int removeIdx = i-k;
            currSum -= nums[removeIdx];
            freq[nums[removeIdx]]--;
            if(freq[nums[removeIdx]]==1){
                duplicates--;
            }
            if(duplicates==0){
                maxSum = Math.max(maxSum,currSum);
            }
        }
        return maxSum;
    }
}