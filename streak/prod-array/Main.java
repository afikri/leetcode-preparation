public class Main {
  public static void main(String[] args) {
      Solution solution = new Solution();

      // Example 1
      int[] nums1 = {-1, -2, -3, -4, 3, 2, 1};
      int result1 = solution.arraySign(nums1);
      System.out.println("Output for nums1: " + result1); // Expected output: 1

      // Example 2
      int[] nums2 = {1, 5, 0, 2, -3};
      int result2 = solution.arraySign(nums2);
      System.out.println("Output for nums2: " + result2); // Expected output: 0

      // Example 3
      int[] nums3 = {-1, 1, -1, 1, -1};
      int result3 = solution.arraySign(nums3);
      System.out.println("Output for nums3: " + result3); // Expected output: -1
  }
}
