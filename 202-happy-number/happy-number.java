class Solution {
    public int square(int n){
        int ans = 0;
        while(n>0){
            int digit = n%10;
            ans += digit * digit;
            n /= 10;
        }
        return ans;
    }
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        do{
            slow = square(slow);
            fast = square(square(fast));
        }while(slow!=fast);
        return slow == 1;
    }
}