class Solution {
  public int findNumberOfLIS(int[] nums) {
      int n = nums.length;
      int[] lengths = new int[n];  // stores the length of longest increasing subsequence ending at index i
      int[] counts = new int[n];   // stores the count of longest increasing subsequences ending at index i
      int maxLength = 0;
      int maxCount = 0;

      for (int i = 0; i < n; i++) {
          lengths[i] = 1;
          counts[i] = 1;

          for (int j = 0; j < i; j++) {
              if (nums[j] < nums[i]) {
                  if (lengths[j] + 1 > lengths[i]) {
                      lengths[i] = lengths[j] + 1;
                      counts[i] = counts[j];
                  } else if (lengths[j] + 1 == lengths[i]) {
                      counts[i] += counts[j];
                  }
              }
          }

          if (lengths[i] > maxLength) {
              maxLength = lengths[i];
              maxCount = counts[i];
          } else if (lengths[i] == maxLength) {
              maxCount += counts[i];
          }
      }

      return maxCount;
  }
}
