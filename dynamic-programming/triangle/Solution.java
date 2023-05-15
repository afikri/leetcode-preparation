import java.util.List;

class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        
        // Create an array to store the minimum path sum for each position in the triangle
        int[] dp = new int[n];
        
        // Initialize the bottom row of dp with the values from the bottom row of the triangle
        List<Integer> lastRow = triangle.get(n - 1);
        for (int i = 0; i < n; i++) {
            dp[i] = lastRow.get(i);
        }
        
        // Traverse the triangle from bottom to top
        for (int row = n - 2; row >= 0; row--) {
            List<Integer> currentRow = triangle.get(row);
            
            // Update the dp array with the minimum path sums for the current row
            for (int i = 0; i <= row; i++) {
                dp[i] = currentRow.get(i) + Math.min(dp[i], dp[i + 1]);
            }
        }
        
        // The minimum path sum will be stored at dp[0] after the traversal
        return dp[0];
    }
}

