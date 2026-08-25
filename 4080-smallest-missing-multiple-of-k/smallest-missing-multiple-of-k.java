class Solution {
    public int missingMultiple(int[] nums, int k) {
        int n = nums.length;
        List<Integer> list = new ArrayList<>();
        for(int i = 0;i<n;i++){
            if(nums[i]%k==0){
                list.add(nums[i]);
            }else continue;
        }
        Collections.sort(list);
        int expected = k;
        for(int i = 0;i<list.size();i++){
            if(list.get(i)==expected){
                expected += k;
            }
        }
        return expected;
    }
}