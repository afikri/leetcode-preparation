import java.util.Arrays;

class Solution {
    public String stoneGameIII(int[] stoneValue) {
        int n = stoneValue.length;
        int[] dp = new int[n + 1]; // dp[i] represents the maximum score difference Alice can achieve starting from index i

        for (int i = n - 1; i >= 0; i--) {
            int take = 0, total = 0;
            dp[i] = Integer.MIN_VALUE;

            for (int j = i; j < Math.min(i + 3, n); j++) {
                take += stoneValue[j];
                total += stoneValue[j];
                dp[i] = Math.max(dp[i], take - dp[j + 1]);
            }

            dp[i] = Math.max(dp[i], total - dp[Math.min(i + 3, n)]);
        }

        int aliceScore = (Arrays.stream(stoneValue).sum() + dp[0]) / 2;
        int bobScore = Arrays.stream(stoneValue).sum() - aliceScore;

        if (aliceScore > bobScore) {
            return "Alice";
        } else if (aliceScore < bobScore) {
            return "Bob";
        } else {
            return "Tie";
        }
    }
}
