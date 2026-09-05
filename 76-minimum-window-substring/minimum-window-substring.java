class Solution {
    public String minWindow(String s, String t) {
        Map<Character,Integer> Smap = new HashMap<>();
        Map<Character,Integer> Tmap = new HashMap<>();
        for(char c : t.toCharArray()){
            Tmap.put(c,Tmap.getOrDefault(c,0)+1);
        }
        int left = 0;
        int count = t.length();
        int minLen = Integer.MAX_VALUE;
        String ans = "";
        for(int right = 0;right<s.length();right++){
            char ch = s.charAt(right);
            Smap.put(ch,Smap.getOrDefault(ch,0)+1);
            if(Tmap.containsKey(ch) && Smap.get(ch)<=Tmap.get(ch)){
                count--;
            }
            while(count==0) {
                if(right-left+1<minLen){
                    minLen = right-left+1;
                    ans = s.substring(left,right+1);
                }
                char leftChar = s.charAt(left);
                Smap.put(leftChar,Smap.get(leftChar)-1);
                if(Tmap.containsKey(leftChar) && Smap.get(leftChar)<Tmap.get(leftChar)){
                    count++;
                }
                left++;
            }
        }
        return ans;
    }
}