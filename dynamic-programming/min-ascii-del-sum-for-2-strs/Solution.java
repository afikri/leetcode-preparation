class Solution {
  public int minimumDeleteSum(String s1, String s2) {
      int m = s1.length();
      int n = s2.length();
      
      // Create a 2D array to store the minimum ASCII sum
      // of deleted characters for substrings of s1 and s2
      int[][] dp = new int[m + 1][n + 1];
      
      // Initialize the first row and column of the array
      for (int i = 1; i <= m; i++) {
          dp[i][0] = dp[i - 1][0] + s1.charAt(i - 1);
      }
      for (int j = 1; j <= n; j++) {
          dp[0][j] = dp[0][j - 1] + s2.charAt(j - 1);
      }
      
      // Fill in the rest of the array
      for (int i = 1; i <= m; i++) {
          for (int j = 1; j <= n; j++) {
              if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                  // If the characters are equal, no deletion is needed
                  dp[i][j] = dp[i - 1][j - 1];
              } else {
                  // If the characters are not equal, find the minimum
                  // between deleting from s1 and deleting from s2
                  dp[i][j] = Math.min(dp[i - 1][j] + s1.charAt(i - 1),
                                      dp[i][j - 1] + s2.charAt(j - 1));
              }
          }
      }
      
      // The last element of the array contains the minimum ASCII sum
      // of deleted characters to make s1 and s2 equal
      return dp[m][n];
  }
}

