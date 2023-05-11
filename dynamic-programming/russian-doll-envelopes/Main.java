public class Main {
  public static void main(String[] args) {
      Solution2 solution = new Solution2();

      int[][] envelopes1 = {{5, 4}, {6, 4}, {6, 7}, {2, 3}};
      int max1 = solution.maxEnvelopes(envelopes1);
      System.out.println("Maximum number of envelopes: " + max1); // Expected output: 3

      int[][] envelopes2 = {{1, 1}, {1, 1}, {1, 1}};
      int max2 = solution.maxEnvelopes(envelopes2);
      System.out.println("Maximum number of envelopes: " + max2); // Expected output: 1

      int[][] envelopes3 = {{4,5}, {4,6}, {6,7}, {2,3}, {1,1}};
      int max3 = solution.maxEnvelopes(envelopes3);
      System.out.println("Maximum number of envelopes: " + max3); // Expected output: 4


  }
}
