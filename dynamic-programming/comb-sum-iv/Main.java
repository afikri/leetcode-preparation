public class Main {
  public static void main(String[] args) {
      Solution solution = new Solution();
      
      int[] nums1 = {1, 2, 3};
      int target1 = 4;
      int result1 = solution.combinationSum4(nums1, target1);
      System.out.println("Result 1: " + result1); // Output: 7
      
      int[] nums2 = {9};
      int target2 = 3;
      int result2 = solution.combinationSum4(nums2, target2);
      System.out.println("Result 2: " + result2); // Output: 0
  }
}
