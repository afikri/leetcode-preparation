import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int maxEnvelopes(int[][] envelopes) {
        // Sort the envelopes based on width in ascending order
        Arrays.sort(envelopes, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                if (a[0] == b[0])
                    return b[1] - a[1]; // Sort by height in descending order when widths are equal
                else
                    return a[0] - b[0];
            }
        });

        int n = envelopes.length;
        int[] dp = new int[n];
        int maxEnvelopes = 0;

        // Use binary search to find the longest increasing subsequence of heights
        for (int i = 0; i < n; i++) {
            int index = Arrays.binarySearch(dp, 0, maxEnvelopes, envelopes[i][1]);

            if (index < 0) {
                index = -(index + 1);
            }

            dp[index] = envelopes[i][1];

            if (index == maxEnvelopes) {
                maxEnvelopes++;
            }
        }

        return maxEnvelopes;
    }
}
