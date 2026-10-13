class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> ans1 = new ArrayList<>();
        ArrayList<Integer> ans2 = new ArrayList<>();
        for(int i = 0;i<n;i++){
            if(nums[i]%2==0) ans1.add(nums[i]);
            else ans2.add(nums[i]);
        }
        ans1.addAll(ans2);
        int[] res = new int[n];
        for(int i = 0;i<n;i++){
            res[i] = ans1.get(i);
        }
        return res;
    }
}