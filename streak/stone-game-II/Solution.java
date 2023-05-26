class Solution {
    public int stoneGameII(int[] piles) {
        int n = piles.length;
        int[][] dp = new int[n][n]; // dp[i][j] represents the maximum number of stones Alice can get from piles[i:] with M = j+1

        // Calculate the cumulative sum of stones from right to left
        int[] suffixSum = new int[n];
        suffixSum[n - 1] = piles[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            suffixSum[i] = suffixSum[i + 1] + piles[i];
        }

        return dfs(piles, 0, 1, suffixSum, dp);
    }

    private int dfs(int[] piles, int i, int M, int[] suffixSum, int[][] dp) {
        if (i == piles.length) {
            return 0; // No more stones left
        }

        if (2 * M >= piles.length - i) {
            return suffixSum[i]; // Alice can take all remaining stones
        }

        if (dp[i][M] != 0) {
            return dp[i][M]; // Return the precalculated value
        }

        int maxStones = 0;
        for (int x = 1; x <= 2 * M; x++) {
            int nextM = Math.max(M, x);
            int stonesTaken = suffixSum[i] - dfs(piles, i + x, nextM, suffixSum, dp);
            maxStones = Math.max(maxStones, stonesTaken);
        }

        dp[i][M] = maxStones;
        return maxStones;
    }
}
