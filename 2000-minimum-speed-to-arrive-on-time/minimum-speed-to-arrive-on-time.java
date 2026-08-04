class Solution {
    private boolean isPossible(int[] dist,double hour,int speed){
        double totalTime = 0;
        int n = dist.length;
        for(int i = 0;i<n-1;i++){
            totalTime += Math.ceil((double)dist[i]/speed);
        }
        totalTime += (double)dist[n-1]/speed;
        return totalTime <= hour;
    }
    public int minSpeedOnTime(int[] dist, double hour) {
        int n = dist.length;
        if(hour<=n-1) return -1;
        int low = 1;
        int high = 10000000;
        int minSpeed = -1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(isPossible(dist,hour,mid)){
                minSpeed = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return minSpeed;
    }
}