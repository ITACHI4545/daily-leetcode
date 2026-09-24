class Solution {
    private int helper(int n){
        int sum = 0;
        while(n>0){
            int last = n%10;
            sum += last;
            n /= 10;
        }
        return sum;
    }
    public int smallestIndex(int[] nums) {
        int n = nums.length;
        for(int i = 0;i<n;i++){
            if(nums[i]>9){
                int digitSum = helper(nums[i]);
                if(digitSum==i) return i;
            }
            else if(nums[i]==i){
                return i;
            }
        }
        return -1;
    }
}