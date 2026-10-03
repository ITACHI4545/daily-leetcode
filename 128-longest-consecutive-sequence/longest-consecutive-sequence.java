class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int n = nums.length;
        if(n==0) return 0;
        int longest = 1;
        for(int i = 0;i<n;i++){
            set.add(nums[i]);
        }
        for(int num : set){
            if(!set.contains(num-1)){
                int currElement = num;
                int currLength = 1;
                while(set.contains(currElement+1)){
                    currElement++;
                    currLength++;
                }
                longest = Math.max(longest,currLength);
            }
        }
        return longest;
    }
}