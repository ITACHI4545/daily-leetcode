class Solution {
    private void swap(int i,int j,int[] nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int j = 0;
        for(int i = 0;i<n;i++){
            if(nums[i]==0) continue;
            else{
                swap(i,j,nums);
                j++;
            }
    }
}
}