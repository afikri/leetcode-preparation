
public class Main {
  public static void main(String[] args) {
      Solution solution = new Solution();

      int[][] pairs1 = {{1, 2}, {2, 3}, {3, 4}};
      int longestChain1 = solution.findLongestChain(pairs1);
      System.out.println("Longest chain: " + longestChain1); // Expected output: 2

      int[][] pairs2 = {{1, 2}, {7, 8}, {4, 5}};
      int longestChain2 = solution.findLongestChain(pairs2);
      System.out.println("Longest chain: " + longestChain2); // Expected output: 3
  }
}
