
public class Main {
  public static void main(String[] args) {
      Solution solution = new Solution();
      
      int[] nums1 = {1, 3};
      int[] nums2 = {2};
      double median1 = solution.findMedianSortedArrays(nums1, nums2);
      System.out.println("Median: " + median1);
      
      int[] nums3 = {1, 2};
      int[] nums4 = {3, 4};
      double median2 = solution.findMedianSortedArrays(nums3, nums4);
      System.out.println("Median: " + median2);
  }
}
