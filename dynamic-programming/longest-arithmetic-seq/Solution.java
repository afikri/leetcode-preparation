import java.util.HashMap;
import java.util.Map;

class Solution {
    public int longestArithSeqLength(int[] nums) {
        int n = nums.length;
        int maxLen = 2; // Minimum length of an arithmetic sequence is 2
        
        // Create a map to store the length of the arithmetic sequence at each index
        Map<Integer, Integer>[] dp = new HashMap[n];
        
        // Initialize the map for each index with an empty HashMap
        for (int i = 0; i < n; i++) {
            dp[i] = new HashMap<>();
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                int diff = nums[i] - nums[j];
                
                // Get the length of the arithmetic sequence ending at index j with the same difference
                int length = dp[j].getOrDefault(diff, 1) + 1;
                
                // Update the maximum length at index i with the current length
                dp[i].put(diff, length);
                
                // Update the overall maximum length
                maxLen = Math.max(maxLen, length);
            }
        }
        
        return maxLen;
    }
}

