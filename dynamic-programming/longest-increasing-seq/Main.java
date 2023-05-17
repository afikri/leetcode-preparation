public class Main {
  public static void main(String[] args) {
      Solution solution = new Solution();
      
      int[] nums1 = {10, 9, 2, 5, 3, 7, 101, 18};
      System.out.println("Length of longest increasing subsequence: " + solution.lengthOfLIS(nums1));
      
      int[] nums2 = {0, 1, 0, 3, 2, 3};
      System.out.println("Length of longest increasing subsequence: " + solution.lengthOfLIS(nums2));
      
      int[] nums3 = {7, 7, 7, 7, 7, 7, 7};
      System.out.println("Length of longest increasing subsequence: " + solution.lengthOfLIS(nums3));
  }
}
