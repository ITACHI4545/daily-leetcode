class Solution {
    public String smallestPalindrome(String s) {
        int n = s.length();
        int half = n/2;
        char[] ch = s.substring(0,half).toCharArray();
        Arrays.sort(ch);
        StringBuilder sb = new StringBuilder();
        sb.append(ch);
        String firstHalf = sb.toString();
        if(n%2!=0){
            sb.append(s.charAt(half));
        }
        sb.append(new StringBuilder(firstHalf).reverse());
        return sb.toString();
    }
}