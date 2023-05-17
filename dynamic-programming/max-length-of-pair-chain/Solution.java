import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int findLongestChain(int[][] pairs) {
        // Sort the pairs based on the ending value
        Arrays.sort(pairs, Comparator.comparingInt(a -> a[1]));
        
        int n = pairs.length;
        int[] dp = new int[n];
        Arrays.fill(dp, 1);
        
        // Dynamic programming approach
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (pairs[j][1] < pairs[i][0]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }
        
        // Find the maximum chain length
        int maxChain = 0;
        for (int i = 0; i < n; i++) {
            maxChain = Math.max(maxChain, dp[i]);
        }
        
        return maxChain;
    }
}
