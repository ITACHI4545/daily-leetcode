class Solution {
    public boolean halvesAreAlike(String s) {
        s = s.toLowerCase();
        int n = s.length();
        String one = s.substring(0,n/2);
        String two = s.substring(n/2,n);
        int count1 = 0;
        int count2 = 0;
        for(char ch : one.toCharArray()){
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') count1++;
        }
        for(char ch : two.toCharArray()){
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') count2++;
        }
        if(count1==count2) return true;
        return false;
    }
}