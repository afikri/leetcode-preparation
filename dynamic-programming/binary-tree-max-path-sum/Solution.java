/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
         this.left = left;
          this.right = right;
      }
  }
 
class Solution {
  int maxSum; // Global variable to track the maximum path sum
  
  public int maxPathSum(TreeNode root) {
      maxSum = Integer.MIN_VALUE; // Initialize maxSum to the minimum value
      
      // Call the recursive helper function to compute the maximum path sum
      computeMaxPathSum(root);
      
      return maxSum;
  }
  
  private int computeMaxPathSum(TreeNode node) {
      if (node == null) {
          return 0;
      }
      
      // Recursively compute the maximum path sum for the left and right subtrees
      int leftSum = Math.max(0, computeMaxPathSum(node.left));
      int rightSum = Math.max(0, computeMaxPathSum(node.right));
      
      // Update the maximum path sum if the current path sum is larger
      maxSum = Math.max(maxSum, node.val + leftSum + rightSum);
      
      // Return the maximum path sum that can be extended from the current node
      return node.val + Math.max(leftSum, rightSum);
  }
}
