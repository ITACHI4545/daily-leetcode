class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        int score = 0;
        for(char ch : s.toCharArray()){
            if(ch=='('){
            st.push(score);
            score = 0;
            }
            else{
                score = st.pop() + Math.max(score*2,1);
            }
        }
        return score;
    }
}