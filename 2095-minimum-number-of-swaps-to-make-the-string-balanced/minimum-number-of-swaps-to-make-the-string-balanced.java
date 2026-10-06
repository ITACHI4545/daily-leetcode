class Solution {
    public int minSwaps(String s) {
        Stack<Character> st = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch == '[') st.push(ch);
            else if(ch == ']' && !st.isEmpty() && st.peek()=='['){
                st.pop();
            }
        }
        return (st.size()+1)/2;
    }
}