class Solution {
    public int maxDepth(String s) {
        int res = 0;
        int curr = 0;
        for(char ch : s.toCharArray()){
            if(ch=='(')curr++;
            else if(ch==')') curr--;
            res = Math.max(curr,res);
        }
        return res;
    }
}