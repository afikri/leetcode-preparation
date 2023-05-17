public class Main {
  public static void main(String[] args) {
      // Example 1
      TreeNode root1 = new TreeNode(3);
      root1.left = new TreeNode(2);
      root1.right = new TreeNode(3);
      root1.left.right = new TreeNode(3);
      root1.right.right = new TreeNode(1);
      Solution solution = new Solution();
      System.out.println(solution.rob(root1)); // Output: 7

      // Example 2
      TreeNode root2 = new TreeNode(3);
      root2.left = new TreeNode(4);
      root2.right = new TreeNode(5);
      root2.left.left = new TreeNode(1);
      root2.left.right = new TreeNode(3);
      root2.right.right = new TreeNode(1);
      System.out.println(solution.rob(root2)); // Output: 9
  }
}