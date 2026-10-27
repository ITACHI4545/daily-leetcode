class Solution {
    long M = (long)(1e9+7);
    public long findPower(long a,long b){
        if(b==0) return 1;
        long half = findPower(a,b/2);
        long result = (half*half)%M;
        if(b%2==1){
            result = (result*a)%M;
        }
        return result;
    }
    public int countGoodNumbers(long n) {
        long even_index = (n+1)/2;
        long odd_index = n/2;
        long count = findPower(5,even_index)*findPower(4,odd_index)%M;
        return (int)count;
    }
}