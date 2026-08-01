class Solution {
    public void swap(char[] s,int start,int end){
        char temp = s[start];
        s[start] = s[end];
        s[end] = temp;
    }
    public void reverseString(char[] s) {
        int n = s.length;
        int start = 0;
        int end = n-1;
        while(start<end){
            swap(s,start,end);
            start++;
            end--;
        }
    }
}