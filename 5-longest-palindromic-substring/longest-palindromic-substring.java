class Solution {
    private int helper(String s,int left,int right){
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        return right-left-1;
    }
    public String longestPalindrome(String s) {
        if(s==null || s.length()<1) return "";
        int n = s.length();
        int start = 0,end=0;
        for(int i = 0;i<s.length();i++){
            int len1 = helper(s,i,i);
            int len2 = helper(s,i,i+1);
            int maxLen = Math.max(len1,len2);
            if(maxLen>end-start){
                start = i - (maxLen-1)/2;
                end = i + maxLen/2;
            }
        }
        return s.substring(start,end+1);
    }
}