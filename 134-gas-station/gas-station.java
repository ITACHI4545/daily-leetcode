class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalkharch = 0;
        int totalkamai = 0;
        for(int num : gas){
            totalkamai += num;
        }
        for(int num : cost){
            totalkharch += num;
        }
        if(totalkamai<totalkharch) return -1;
        int total = 0;
        int result = 0;
        int n = gas.length;
        for(int i = 0;i<n;i++){
            total = total + gas[i] - cost[i];
            if(total<0){
                total = 0;
                result = i+1;

            }
        }
        return result;
    }
}