class Solution {
    private boolean isEqual(int[] freq){
        int targetFreq = 0;
        for(int count : freq){
            if(count==0) continue;
            if(targetFreq==0){
                targetFreq = count;
            }else if(count != targetFreq) return false;
        }
        return true;
    }
    public boolean equalFrequency(String word) {
        int[] freq = new int[26];
        for(char ch : word.toCharArray()){
            freq[ch-'a']++;
        }
        for(int i = 0;i<freq.length;i++){
            if(freq[i]==0) continue;
            freq[i]--;
            if(isEqual(freq)) return true;
            freq[i]++;
        }
        return false;
    }
}