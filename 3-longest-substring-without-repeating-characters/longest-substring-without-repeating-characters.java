class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int i = 0;
        HashSet<Character> set = new HashSet<>();
        for(int j = 0;j<s.length();j++){
            while(set.contains(s.charAt(j))){
                set.remove(s.charAt(i));
                i++;
            }
            set.add(s.charAt(j));
            maxLength = Math.max(maxLength,j-i+1);
        }
        return maxLength;
    }
}