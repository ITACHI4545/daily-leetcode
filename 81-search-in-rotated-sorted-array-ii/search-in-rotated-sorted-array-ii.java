class Solution {
     public int findPivot(int[] nums){
        int low = 0;
        int high = nums.length-1;
        while(low<high){
            while(low<high && nums[low]==nums[high]) low++;
            int mid = low + (high-low)/2;
            if(nums[mid]>nums[high]) low = mid+1;
            else high = mid;
        }
        return high;
    }
    public boolean BinarySearch(int[] nums,int low,int high,int target){
        while(low<=high){
            int mid = low + (high-low)/2;
            if(nums[mid]==target){
                return true;
            }
            else if(nums[mid]<target) low = mid+1;
            else high = mid-1;
        }
        return false;
    }
    public boolean search(int[] nums, int target) {
        int n = nums.length;
        int pivotIndex = findPivot(nums);
        if(BinarySearch(nums,0,pivotIndex-1,target)) return true; //left half
        if(BinarySearch(nums,pivotIndex,n-1,target)) return true; //right half including pivotindex
        return false;
    }
}