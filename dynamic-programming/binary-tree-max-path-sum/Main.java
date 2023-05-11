public class Main {
  public static void main(String[] args) {
      // Create the binary tree for testing
      TreeNode root1 = new TreeNode(1);
      root1.left = new TreeNode(2);
      root1.right = new TreeNode(3);

      TreeNode root2 = new TreeNode(-10);
      root2.left = new TreeNode(9);
      root2.right = new TreeNode(20);
      root2.right.left = new TreeNode(15);
      root2.right.right = new TreeNode(7);

      // Create an instance of the Solution class
      Solution solution = new Solution();

      // Test case 1
      int maxSum1 = solution.maxPathSum(root1);
      System.out.println("Max Path Sum (Test case 1): " + maxSum1); // Expected output: 6

      // Test case 2
      int maxSum2 = solution.maxPathSum(root2);
      System.out.println("Max Path Sum (Test case 2): " + maxSum2); // Expected output: 42
  }
}
