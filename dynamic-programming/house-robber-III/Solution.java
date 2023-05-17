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
    public int rob(TreeNode root) {
        int[] result = robHelper(root);
        return Math.max(result[0], result[1]);
    }

    private int[] robHelper(TreeNode node) {
        if (node == null) {
            return new int[2];
        }

        int[] left = robHelper(node.left);
        int[] right = robHelper(node.right);

        int[] result = new int[2];

        // If the node is robbed, we cannot rob its children
        result[0] = node.val + left[1] + right[1];

        // If the node is not robbed, we can choose to rob its children
        result[1] = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);

        return result;
    }
}


