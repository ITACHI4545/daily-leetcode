class Solution {
    public int minMoves(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int count = 0;
        for(int i = 0;i<n;i++){
            count += (nums[i]-nums[0]);
        }
        return count;
    }
}