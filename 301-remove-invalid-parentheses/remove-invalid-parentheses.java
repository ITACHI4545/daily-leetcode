class Solution {
    int n;
    HashSet<String> set = new HashSet<>();
    int maxLen;
    public void solve(String s,int i,StringBuilder curr,int count){
        if(count<0) return;
        if(i==n){
            if(count==0){
                if(curr.length()>maxLen){
                    maxLen = curr.length();
                    set.clear();
                }
                if(curr.length()==maxLen) set.add(curr.toString());
            }
            return;
        }
        if(s.charAt(i)!='(' && s.charAt(i)!=')'){
            curr.append(s.charAt(i));
            solve(s,i+1,curr,count);
            curr.deleteCharAt(curr.length()-1);
            return;
        }
        curr.append(s.charAt(i));
        solve(s,i+1,curr,count + (s.charAt(i)=='(' ? 1 : -1));
        curr.deleteCharAt(curr.length()-1);
        solve(s,i+1,curr,count);
    }
    public List<String> removeInvalidParentheses(String s) {
        n = s.length();
        set.clear();
        maxLen = 0;
        StringBuilder curr = new StringBuilder();
        solve(s,0,curr,0);
        return new ArrayList<>(set);
    }
}