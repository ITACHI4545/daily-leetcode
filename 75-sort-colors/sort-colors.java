class Solution {
    private void swap(int a,int b,int[] nums){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
    public void sortColors(int[] nums) {
        int n = nums.length;
        int i = 0;
        int j = 0;
        int k = n-1;
        while(j<=k){
            if(nums[j]==2){
                swap(j,k,nums);
                k--;
            }
            else if(nums[j]==0){
                swap(j,i,nums);
                i++;
                j++;
            }else{
                j++;
            }
        }
    }
}