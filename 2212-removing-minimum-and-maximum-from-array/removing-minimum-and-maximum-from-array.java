class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        int min = nums[0];
        int max = nums[0];
        int minIdx = 0;
        int maxIdx = 0;
        for(int i = 1;i<n;i++){
            if(nums[i]>max){
                max = nums[i];
                maxIdx = i;
            }
            if(nums[i]<min){
                min = nums[i];
                minIdx = i;
            }
        }
        int diff1 = Math.max(maxIdx,minIdx)+1;
        int diff2 = n - Math.min(maxIdx,minIdx);
        int diff3 = Math.min(maxIdx,minIdx)+1 + n-Math.max(maxIdx,minIdx);
        return Math.min(diff1,Math.min(diff2,diff3));
    }
}