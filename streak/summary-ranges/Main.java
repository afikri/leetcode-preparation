import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
      Solution solution = new Solution();

      int[] nums1 = {0, 1, 2, 4, 5, 7};
      List<String> ranges1 = solution.summaryRanges(nums1);
      System.out.println(ranges1);  // Output: ["0->2", "4->5", "7"]

      int[] nums2 = {0, 2, 3, 4, 6, 8, 9};
      List<String> ranges2 = solution.summaryRanges(nums2);
      System.out.println(ranges2);  // Output: ["0", "2->4", "6", "8->9"]
  }
}
