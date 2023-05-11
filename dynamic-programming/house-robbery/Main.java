public class Main {
  public static void main(String[] args) {
      Solution solution = new Solution();
      
      // Test Case 1
      int[] nums1 = {1, 2, 3, 1};
      int result1 = solution.rob(nums1);
      System.out.println("Maximum amount of money: " + result1); // Expected output: 4
      
      // Test Case 2
      int[] nums2 = {2, 7, 9, 3, 1};
      int result2 = solution.rob(nums2);
      System.out.println("Maximum amount of money: " + result2); // Expected output: 12
      
      // Test Case 3
      int[] nums3 = {2, 1, 1, 2};
      int result3 = solution.rob(nums3);
      System.out.println("Maximum amount of money: " + result3); // Expected output: 4
  }
}
