class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        List<Integer> ans = new ArrayList<>();
        int n = seq.length();
        int depth = 0;
        char[] ne = seq.toCharArray();
        for(int i = 0;i<ne.length;i++){
            if(ne[i]=='(' && depth%2!=0){
                ans.add(1);
                depth++;
            }
            else if(ne[i]=='(' && depth%2==0){
                ans.add(0);
                depth++;
            }
            else if(ne[i]== ')'){
            depth--;
            if(depth%2!=0) ans.add(1);
            else{
                ans.add(0);
            }}
        }
        int[] res = new int[n];
        for(int i = 0;i<n;i++){
            res[i] = ans.get(i);
        }
        return res;
    }
}