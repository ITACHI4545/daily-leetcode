class Solution {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;
        int count = 0;
        int left = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int right = 0;right<n;right++){
            map.put(fruits[right],1+map.getOrDefault(fruits[right],0));
            while(map.size()>2){
                map.put(fruits[left],map.get(fruits[left])-1);
                if(map.get(fruits[left])==0){
                    map.remove(fruits[left]);
                }
                left++;
            }
            count = Math.max(count,right-left+1);
        }
        return count;
    }
}