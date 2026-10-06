class Solution {
    public int binarySearch(MountainArray mountainArr,int low,int high,int target){
        while(low<=high){
            int mid = low + (high-low)/2;
            if(mountainArr.get(mid)==target) return mid;
            else if(mountainArr.get(mid)>target) high = mid-1;
            else low = mid+1;
        }
        return -1;
    }
    public int reverseBinarySearch(MountainArray mountainArr,int low,int high,int target){
        while(low<=high){
            int mid = low + (high-low)/2;
            if(mountainArr.get(mid)==target) return mid;
            else if(mountainArr.get(mid)<target) high = mid-1;
            else low = mid+1;
        }
        return -1;
    }
    public int peakIndexInMountainArray(MountainArray mountainArr){
        int n = mountainArr.length();
        int low = 0;
        int high = n-1;
        while(low<high){
            int mid = low + (high-low)/2;
            if(mountainArr.get(mid)<mountainArr.get(mid+1)) low = mid+1;
            else high = mid;
        }
        return low;
    }
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int n = mountainArr.length();
        int idx = peakIndexInMountainArray(mountainArr);
        int resultidx = binarySearch(mountainArr,0,idx,target);
        if(resultidx!=-1) return resultidx;
        resultidx = reverseBinarySearch(mountainArr,idx+1,n-1,target);
        return resultidx;
    }
}