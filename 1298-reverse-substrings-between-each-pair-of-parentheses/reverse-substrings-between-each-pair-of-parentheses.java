class Solution {
    public String reverseParentheses(String s) {
        StringBuilder result = new StringBuilder();
        Stack<Integer> lastlength = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                lastlength.push(result.length());
            } else if (ch == ')') {
                int start = lastlength.pop();
                int end = result.length() - 1;
                while (start < end) {
                    char temp = result.charAt(start);
                    result.setCharAt(start, result.charAt(end));
                    result.setCharAt(end, temp);
                    start++;
                    end--;
                }
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }
}