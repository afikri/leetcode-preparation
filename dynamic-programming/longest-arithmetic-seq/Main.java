public class Main {
  public static void main(String[] args) {
      Solution solution = new Solution();
      
      int[] nums1 = {3, 6, 9, 12};
      int result1 = solution.longestArithSeqLength(nums1);
      System.out.println("Longest arithmetic subsequence length: " + result1);
      
      int[] nums2 = {9, 4, 7, 2, 10};
      int result2 = solution.longestArithSeqLength(nums2);
      System.out.println("Longest arithmetic subsequence length: " + result2);
      
      int[] nums3 = {20, 1, 15, 3, 10, 5, 8};
      int result3 = solution.longestArithSeqLength(nums3);
      System.out.println("Longest arithmetic subsequence length: " + result3);
  }
}
