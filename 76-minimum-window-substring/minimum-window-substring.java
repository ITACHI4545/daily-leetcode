class Solution {
    public String minWindow(String s, String t) {
        if (s.length() < t.length()) return "";
        Map<Character, Integer> map = new HashMap<>();
        for (char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int i = 0, j = 0;
        int requiredCount = t.length();
        int windowSize = Integer.MAX_VALUE;
        int starti = 0;
        while (j < s.length()) {
            char rightChar = s.charAt(j);
            if (map.containsKey(rightChar)) {
                if (map.get(rightChar) > 0) {
                    requiredCount--;
                }
                map.put(rightChar, map.get(rightChar) - 1);
            }
            while (requiredCount == 0) {
                int currWindowSize = j - i + 1;
                if (currWindowSize < windowSize) {
                    windowSize = currWindowSize;
                    starti = i;
                }
                char leftChar = s.charAt(i);
                if (map.containsKey(leftChar)) {
                    map.put(leftChar, map.get(leftChar) + 1);
                    if (map.get(leftChar) > 0) {
                        requiredCount++;
                    }
                }
                i++;
            }
            j++;
        }
        return windowSize == Integer.MAX_VALUE ? "" : s.substring(starti, starti + windowSize);
    }
}