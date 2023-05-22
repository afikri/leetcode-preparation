import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
      Solution solution = new Solution();
      
      // Test case 1
      int[] nums1 = {1, 1, 1, 2, 2, 3};
      int k1 = 2;
      int[] result1 = solution.topKFrequent(nums1, k1);
      System.out.println(Arrays.toString(result1)); // Output: [1, 2]
      
      // Test case 2
      int[] nums2 = {1};
      int k2 = 1;
      int[] result2 = solution.topKFrequent(nums2, k2);
      System.out.println(Arrays.toString(result2)); // Output: [1]
  }
}