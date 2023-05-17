public class Main {
  public static void main(String[] args) {
      Solution solution = new Solution();

      int[] nums1 = {1, 3, 5, 4, 7};
      int result1 = solution.findNumberOfLIS(nums1);
      System.out.println("Number of longest increasing subsequences: " + result1);

      int[] nums2 = {2, 2, 2, 2, 2};
      int result2 = solution.findNumberOfLIS(nums2);
      System.out.println("Number of longest increasing subsequences: " + result2);
  }
}
