import java.util.Arrays;

class Solution {
  public int solve(int low, int high, int zero, int one, int zeroCount, int oneCount, int[] dp, int mod) {
    if (zeroCount + oneCount > high)
      return 0;

    int count = 0;

    if (zeroCount + oneCount >= low && zeroCount + oneCount <= high) {
      count = count + 1;
    }

    if (dp[zeroCount + oneCount] != -1)
      return dp[zeroCount + oneCount];

    count += solve(low, high, zero, one, zeroCount + zero, oneCount, dp, mod) % mod;

    count += solve(low, high, zero, one, zeroCount, oneCount + one, dp, mod) % mod;

    dp[zeroCount + oneCount] = count % mod;

    return dp[zeroCount + oneCount];
  }

  public int countGoodStrings(int low, int high, int zero, int one) {
    int[] dp = new int[high + 1];
    Arrays.fill(dp, -1);
    int mod = (int) (1e9 + 7);

    return solve(low, high, zero, one, 0, 0, dp, mod);
  }
}
