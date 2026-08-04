class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        List<Integer> res = new ArrayList<>();
        int idx=0;
        for(int i = nums[0];i<=nums[n-1];i++){
            if(idx<n && nums[idx]==i){
                idx++;
            }else{
                res.add(i);
            }
        }
        return res;
    }
}