class Solution {
    HashMap<String,Boolean> map = new HashMap<>();
    public boolean isScramble(String s1, String s2) {
        if(s1.equals(s2)) return true;
        if(s1.length()!=s2.length()) return false;
        int[] count = new int[26];
        for(int i = 0;i<s1.length();i++){
            count[s1.charAt(i)-'a']++;
            count[s2.charAt(i)-'a']--;
        }
        for(int c : count){
            if(c!=0) return false;
        }
        String key = s1+"-"+s2;
        if(map.containsKey(key)){
            return map.get(key);
        }
        int n = s1.length();
        boolean isScrambled = false;
        for(int i = 1;i<n;i++){
            boolean swapped = isScramble(s1.substring(0,i),s2.substring(n-i)) && isScramble(s1.substring(i),s2.substring(0,n-i));

            boolean notSwapped = isScramble(s1.substring(0,i),s2.substring(0,i)) && isScramble(s1.substring(i),s2.substring(i));

            if(swapped || notSwapped){
                isScrambled = true;
                break;
            }
        }
        map.put(key,isScrambled);
        return isScrambled;
    }
}