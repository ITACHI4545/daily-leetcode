class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int i = 0;
        int j = p.length()-1;
        List<Integer> list = new ArrayList<>();
        if(s.length()<p.length()) return list;
        int[] freq1 = new int[26];
        for(int k = 0;k<p.length();k++){
            freq1[s.charAt(k)-'a']++;
        }
        int[] freq2 = new int[26];
        for(char ch : p.toCharArray()){
            freq2[ch-'a']++;
        }
        while(i<=s.length()-p.length()){
            if(Arrays.equals(freq1,freq2)){
                list.add(i);
            }
            if(j+1<s.length()){
                freq1[s.charAt(i)-'a']--;
                freq1[s.charAt(j+1)-'a']++;
            }
            i++;
            j++;
        }
        return list;
    }
}