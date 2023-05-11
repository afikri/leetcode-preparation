import java.util.Arrays;
public class Main {
  public static void main(String[] args) {
      Solution solution = new Solution();
      
      int[] nums1 = {1, 2, 3, 4, 5};
      int[] diff1 = solution.distinctDifferenceArray(nums1);
      System.out.println(Arrays.toString(diff1));
      // Output: [-3, -1, 1, 3, 5]
      
      int[] nums2 = {3, 2, 3, 4, 2};
      int[] diff2 = solution.distinctDifferenceArray(nums2);
      System.out.println(Arrays.toString(diff2));
      // Output: [-2, -1, 0, 2, 3]
  }
}
