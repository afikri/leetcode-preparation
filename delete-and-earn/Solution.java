import java.util.Arrays;

class Solution {
    public int deleteAndEarn(int[] nums) {
        int maxVal = 0;
        for (int num : nums) {
            maxVal = Math.max(maxVal, num);
        }

        int[] sum = new int[maxVal + 1];
        for (int num : nums) {
            sum[num] += num;
        }

        int[] dp = new int[maxVal + 1];
        dp[0] = 0;
        dp[1] = sum[1];

        for (int i = 2; i <= maxVal; i++) {
            dp[i] = Math.max(dp[i - 2] + sum[i], dp[i - 1]);
        }

        return dp[maxVal];
    }
}

