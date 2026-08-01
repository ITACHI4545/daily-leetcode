class Solution {
    public boolean helper(String s,int left,int right){
               while(left<right){
            if(s.charAt(left)==s.charAt(right)){
                left++;
                right--;
            }else return false;
        }
        return true;
    }
    public boolean validPalindrome(String s) {
        int n = s.length();
        int left = 0;
        int right = n-1;
        while(left<right){
            if(s.charAt(left)==s.charAt(right)){
                left++;
                right--;
            }else{
                return helper(s,left+1,right) || helper(s,left,right-1);
            }
        }
        return true;
    }
}