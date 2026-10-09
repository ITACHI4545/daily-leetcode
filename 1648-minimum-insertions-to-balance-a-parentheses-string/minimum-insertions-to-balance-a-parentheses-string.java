class Solution {
    public int minInsertions(String s) {
        int n = s.length();
        int result = 0; //insertions
        int count = 0;
        int i = 0;
        while(i<n){
            if(s.charAt(i)=='('){
                count++;
                i++;
            }
            else{ //')'
                if(count>0){
                    count--;
                }else{
                    result++; // '(' bracket is not found that's why adding
                }
                if(i+1<n && s.charAt(i+1)==')'){
                    i += 2;
                }else{
                    result += 1; //adding a ')' bracket
                    i++;
                }
            }
        }
        return result + count*2;
    }
}