class Solution {
    public String getPermutation(int n, int k) {
        int fact = 1;
        List<Integer> numbers = new ArrayList<>();
        for(int i = 1;i<n;i++){
            fact = fact*i;
            numbers.add(i);
        }
        numbers.add(n);
        StringBuilder result = new StringBuilder();
        k = k-1;
        while(true){
            int index = k/fact;
            result.append(numbers.get(index));
            numbers.remove(index);
            if(numbers.isEmpty()){
                break;
            }
            k = k%fact;
            fact = fact/numbers.size();
        }
        return result.toString();
    }
}