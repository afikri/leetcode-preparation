public class Main {
  public static void main(String[] args) {
      Solution solution = new Solution();
      
      // Test case 1
      int[] arr1 = {3, 5, 1};
      System.out.println(solution.canMakeArithmeticProgression(arr1));  // Output: true
      
      // Test case 2
      int[] arr2 = {1, 2, 4};
      System.out.println(solution.canMakeArithmeticProgression(arr2));  // Output: false
  }
}
