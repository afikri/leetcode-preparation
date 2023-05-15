class Solution {
  public int minFallingPathSum(int[][] matrix) {
      int n = matrix.length;
      int[][] dp = new int[n][n];
      
      // Initialize the first row of dp with the values from the matrix
      for (int i = 0; i < n; i++) {
          dp[0][i] = matrix[0][i];
      }
      
      // Iterate through each row and calculate the minimum falling path sum
      for (int i = 1; i < n; i++) {
          for (int j = 0; j < n; j++) {
              int minPrev = dp[i - 1][j];
              
              if (j > 0) {
                  minPrev = Math.min(minPrev, dp[i - 1][j - 1]);
              }
              
              if (j < n - 1) {
                  minPrev = Math.min(minPrev, dp[i - 1][j + 1]);
              }
              
              dp[i][j] = matrix[i][j] + minPrev;
          }
      }
      
      // Find the minimum sum in the last row of dp
      int minSum = dp[n - 1][0];
      for (int i = 1; i < n; i++) {
          minSum = Math.min(minSum, dp[n - 1][i]);
      }
      
      return minSum;
  }
}
