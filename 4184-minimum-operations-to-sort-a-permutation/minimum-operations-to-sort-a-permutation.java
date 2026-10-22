class Solution {
    public int minOperations(int[] nums) {
        int ascCount = 0;
        int desCount = 0;
        int n = nums.length;
        for(int i = 1;i<n;i++){
            ascCount += (nums[i]==(nums[i-1]+1)%n)?1:0;
            desCount += (nums[i-1]==(nums[i]+1)%n)?1:0;
        }
        if(ascCount == n-1 && nums[0]==0) return 0;
        if(ascCount == n-1){
            int leftrot = n - nums[0];
            int rightrot = nums[n-1]+3;
            return Math.min(leftrot,rightrot);
        }
        if(desCount==n-1){
            //mandatory 1 rev
            int leftrot = n - nums[n-1]+1;
            int rightrot = (nums[0]+1)%n + 1;
            return Math.min(leftrot,rightrot);
        }
        return -1;
    }
}