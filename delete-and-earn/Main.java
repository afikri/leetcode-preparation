public class Main {
  public static void main(String[] args) {
      Solution solution = new Solution();

      int[] nums1 = {3, 4, 2};
      int result1 = solution.deleteAndEarn(nums1);
      System.out.println("Result 1: " + result1); // Expected output: 6

      int[] nums2 = {2, 2, 3, 3, 3, 4};
      int result2 = solution.deleteAndEarn(nums2);
      System.out.println("Result 2: " + result2); // Expected output: 9
  }
}
