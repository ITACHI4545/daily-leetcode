class Solution {
    public boolean canEatAll(int[] piles,int mid,int h){
        int actualhours = 0;
        for(int num : piles){
            actualhours += num/mid;
            if(num%mid!=0) actualhours++;
        }
        if(actualhours<=h) return true;
        return false;
    }
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int low = 1;
        int high = piles[piles.length-1];
        while(low<high){
            int mid = low + (high-low)/2; //per hr i can eat mid bananas
            if(canEatAll(piles,mid,h)){
                high = mid;
            }else low = mid+1;
        }
        return low;
    }
}