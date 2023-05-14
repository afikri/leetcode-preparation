public class Main {
  public static void main(String[] args) {
      // Example test cases
      int[] nums1 = {1, 2};
      int[] nums2 = {3, 4, 6, 8};
      int[] nums3 = {1, 2, 3, 4, 5, 6};

      Solution solution = new Solution();

      int maxScore1 = solution.maxScore(nums1);
      System.out.println("Max score for nums1: " + maxScore1);

      int maxScore2 = solution.maxScore(nums2);
      System.out.println("Max score for nums2: " + maxScore2);

      int maxScore3 = solution.maxScore(nums3);
      System.out.println("Max score for nums3: " + maxScore3);
  }
}
