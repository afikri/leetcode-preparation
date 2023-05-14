class Solution {
  public int minInsertions(String s) {
    int[][] dp = new int[s.length()][s.length()];

    for (int len = 2; len <= s.length(); len++) {
      for (int i = 0; i < s.length() - len + 1; i++) {
        int j = i + len - 1;

        if (s.charAt(i) == s.charAt(j)) {
          dp[i][j] = dp[i + 1][j - 1];
        } else {
          dp[i][j] = Math.min(dp[i + 1][j], dp[i][j - 1]) + 1;
        }
      }
    }

    return dp[0][s.length() - 1];
  }
}