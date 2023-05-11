class Solution {
    public int numDistinct(String s, String t) {
        int m = s.length();
        int n = t.length();
        
        // Create a 2D array to store the intermediate results
        int[][] dp = new int[m + 1][n + 1];
        
        // Initialize the first row with 1's since an empty string can be formed from any non-empty string once
        for (int i = 0; i <= m; i++) {
            dp[i][0] = 1;
        }
        
        // Iterate over the characters of s and t
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                // If the characters match, we have two options:
                // 1. Include the current character in both s and t, so we look for the remaining subsequences in (s-1, t-1).
                // 2. Exclude the current character from s, so we look for subsequences in (s-1, t).
                if (s.charAt(i - 1) == t.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
                } else {
                    // If the characters don't match, we can only exclude the current character from s.
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        
        // The bottom-right element of the dp array stores the final result
        return dp[m][n];
    }
}
