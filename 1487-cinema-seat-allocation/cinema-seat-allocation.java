class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        HashMap<Integer,HashSet<Integer>> map = new HashMap<>();
        for(int[] seat : reservedSeats){
            int row = seat[0];
            int col = seat[1];
            if(col>=2 && col<=9){
                map.putIfAbsent(row,new HashSet<>());
                map.get(row).add(col);
            }
        }
        int totalFamilies = (n-map.size())*2;
        for(HashSet<Integer> reserved : map.values()){
            boolean leftFree = !reserved.contains(2) && !reserved.contains(3) && !reserved.contains(4) && !reserved.contains(5);
            boolean rightFree = !reserved.contains(6) && !reserved.contains(7) && !reserved.contains(8) && !reserved.contains(9);
            boolean middleFree = !reserved.contains(4) && !reserved.contains(5) && !reserved.contains(6) && !reserved.contains(7);
            
            if (leftFree && rightFree) {
                totalFamilies += 2;
            } else if (leftFree || rightFree || middleFree) {
                totalFamilies += 1;
            }
        }
        return totalFamilies;
        }
    }