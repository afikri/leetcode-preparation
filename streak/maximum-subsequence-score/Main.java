public class Main {
  public static void main(String[] args) {
      Solution solution = new Solution();

      int[] nums1 = {1, 3, 3, 2};
      int[] nums2 = {2, 1, 3, 4};
      int k = 3;
      long result = solution.maxScore(nums1, nums2, k);
      System.out.println("Max Score: " + result);

      int[] nums3 = {4, 2, 3, 1, 1};
      int[] nums4 = {7, 5, 10, 9, 6};
      k = 1;
      result = solution.maxScore(nums3, nums4, k);
      System.out.println("Max Score: " + result);
  }
}
