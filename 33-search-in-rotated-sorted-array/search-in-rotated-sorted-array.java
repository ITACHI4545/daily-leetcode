class Solution {
    public int findPivot(int[] nums){
        int low = 0;
        int high = nums.length-1;
        while(low<high){
            int mid = low + (high-low)/2;
            if(nums[mid]>nums[high]) low = mid+1;
            else high = mid;
        }
        return high;
    }
    public int BinarySearch(int[] nums,int low,int high,int target){
        int idx = -1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(nums[mid]==target){
                idx = mid;
                break;
            }
            else if(nums[mid]<target) low = mid+1;
            else high = mid-1;
        }
        return idx;
    }
    public int search(int[] nums, int target) {
        int n = nums.length;
        int pivotIndex = findPivot(nums);
        int idx = BinarySearch(nums,0,pivotIndex-1,target); //left half
        if(idx!=-1) return idx;
        idx =  BinarySearch(nums,pivotIndex,n-1,target); //right half including pivotindex
        return idx;
    }
}