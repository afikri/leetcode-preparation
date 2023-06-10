public class Main {
  public static void main(String[] args) {
      Solution solution = new Solution();

      // Example 1
      int n1 = 4;
      int index1 = 2;
      int maxSum1 = 6;
      int result1 = solution.maxValue(n1, index1, maxSum1);
      System.out.println("Result 1: " + result1); // Output: 2

      // Example 2
      int n2 = 6;
      int index2 = 1;
      int maxSum2 = 10;
      int result2 = solution.maxValue(n2, index2, maxSum2);
      System.out.println("Result 2: " + result2); // Output: 3

      // Custom test case
      int n3 = 3;
      int index3 = 2;
      int maxSum3 = 18;
      int result3 = solution.maxValue(n3, index3, maxSum3);
      System.out.println("Result 3: " + result3); // Output: 7
  }
}
