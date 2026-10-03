class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int count = 0;
        for(int num : set){
            if(!set.contains(num-1)){
                int curr = num;
                int currCount = 1;
            while(set.contains(curr+1)){
                curr += 1;
                currCount += 1;
            }
            count = Math.max(count,currCount);
            }
        }
        return count;
    }
}