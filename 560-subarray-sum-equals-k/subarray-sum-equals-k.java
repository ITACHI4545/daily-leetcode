class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int prefixSum = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i = 0;i<nums.length;i++){
            prefixSum += nums[i];
            int target = prefixSum - k;
            if(map.containsKey(target)){
                count += map.get(target);
            }
            map.put(prefixSum,1+map.getOrDefault(prefixSum,0));
        }
        return count;
    }
}