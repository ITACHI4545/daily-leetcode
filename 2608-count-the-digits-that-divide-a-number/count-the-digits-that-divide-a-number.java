class Solution {
    public int countDigits(int num) {
        int temp = num;
        int count = 0;
        while(temp>0){
            int n = temp%10;
            temp /= 10;
            if(num%n==0) count++;
        }
        return count;
    }
}