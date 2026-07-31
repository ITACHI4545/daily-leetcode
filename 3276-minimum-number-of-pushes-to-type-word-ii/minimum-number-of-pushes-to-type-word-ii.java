class Solution {
    public int minimumPushes(String word) {
        int[] count = new int[26];
        for(char c : word.toCharArray()){
            count[c-'a']++;
        }
        Arrays.sort(count);
        int total = 0;
        int mappedCount = 0;
        for(int i = 25;i>=0;i--){
            if(count[i]==0) break;
            int pushes = (mappedCount/8)+1;
            total += count[i]*pushes;
            mappedCount++;
        }
        return total;
    }
}