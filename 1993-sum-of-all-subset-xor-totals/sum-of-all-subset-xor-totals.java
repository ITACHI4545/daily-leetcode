class Solution {
    public int subsetXORSum(int[] nums) {
        int totalOr = 0;
        for (int num : nums) {
            totalOr |= num;
        }
        return totalOr << (nums.length - 1);
    }
}