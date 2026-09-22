class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] ans = new int[]{-1,-1};
        for(int i = 0;i<nums.length;i++){
            int rem = target - nums[i];
            if(map.containsKey(rem)){
                int j = map.get(rem);
                ans[0] = i;
                ans[1] = j;
                break;
            }
            else map.put(nums[i],i); 
        }
        return ans;
    }
}