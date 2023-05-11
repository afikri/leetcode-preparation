class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return nums[0];
        }
        
        // Create an array to store the maximum amount of money that can be robbed 
        // at each house
        int[] dp = new int[n];
        
        // Initialize the base cases
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        
        // Iterate through the array to calculate the maximum amount of money 
        // that can be robbed
        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(nums[i] + dp[i - 2], dp[i - 1]);
        }
        
        return dp[n - 1];
    }
}
