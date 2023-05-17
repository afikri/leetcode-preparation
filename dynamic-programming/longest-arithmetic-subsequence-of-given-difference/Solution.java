import java.util.HashMap;
import java.util.Map;

class Solution {
    public int longestSubsequence(int[] arr, int difference) {
        Map<Integer, Integer> dp = new HashMap<>();
        int longest = 0;
        
        for (int num : arr) {
            int prev = num - difference;
            int length = dp.getOrDefault(prev, 0) + 1;
            dp.put(num, length);
            longest = Math.max(longest, length);
        }
        
        return longest;
    }
}


