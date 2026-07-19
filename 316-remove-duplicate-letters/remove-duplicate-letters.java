class Solution {
    public String removeDuplicateLetters(String s) {
        int[] lastidx = new int[26];
        for(int i = 0;i<s.length();i++){
            lastidx[s.charAt(i)-'a']=i;
        }
        boolean[] visited = new boolean[26];
        Stack<Integer> st = new Stack<>();
        for(int i = 0;i<s.length();i++){
            int curr = s.charAt(i)-'a';
        if(visited[curr]){
            continue;
        }
        while(!st.isEmpty() && st.peek()>curr && i<lastidx[st.peek()]){
            visited[st.pop()] = false;
        }
        st.push(curr);
        visited[curr] = true;
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append((char)(st.pop()+'a'));
        }
        return sb.reverse().toString();
    }
}