class Solution {
    public String reverseWords(String s) {
        String ans = "";
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch!=' '){
                sb.append(ch);
            }else{
                sb.reverse();
                ans += sb;
                ans += ' ';
                sb.setLength(0);
            }
        }
        sb.reverse();
        ans += sb;
        return ans;
    }
}