class Solution {
    public boolean canCross(int[] stones) {
        int n = stones.length;
        
        // Create a boolean array for dynamic programming
        boolean[][] dp = new boolean[n][n];
        
        // Mark the first stone as reachable
        dp[0][0] = true;
        
        // Iterate through each stone
        for (int i = 1; i < n; i++) {
            // Iterate through all previous stones
            for (int j = i - 1; j >= 0; j--) {
                int jump = stones[i] - stones[j];
                
                // If the jump is too large, break the loop
                if (jump > j + 1)
                    break;
                
                // Check if it's possible to reach the current stone with the given jump
                dp[i][jump] = dp[j][jump - 1] || dp[j][jump] || dp[j][jump + 1];
                
                // If the last stone is reachable, return true
                if (i == n - 1 && dp[i][jump])
                    return true;
            }
        }
        
        // The last stone is not reachable
        return false;
    }
}
