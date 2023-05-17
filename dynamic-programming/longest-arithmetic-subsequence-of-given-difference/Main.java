public class Main {
  public static void main(String[] args) {
      Solution solution = new Solution();
      
      // Test case 1
      int[] arr1 = {1, 2, 3, 4};
      int diff1 = 1;
      int longest1 = solution.longestSubsequence(arr1, diff1);
      System.out.println("Longest subsequence: " + longest1);  // Output: 4
      
      // Test case 2
      int[] arr2 = {1, 3, 5, 7};
      int diff2 = 1;
      int longest2 = solution.longestSubsequence(arr2, diff2);
      System.out.println("Longest subsequence: " + longest2);  // Output: 1
      
      // Test case 3
      int[] arr3 = {1, 5, 7, 8, 5, 3, 4, 2, 1};
      int diff3 = -2;
      int longest3 = solution.longestSubsequence(arr3, diff3);
      System.out.println("Longest subsequence: " + longest3);  // Output: 4
  }
}