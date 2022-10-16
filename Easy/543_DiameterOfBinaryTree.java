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
class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        if (root.left == null && root.right == null) {
            return 0;
        } else if (root.left == null || root.right == null) {
            return height(root);
        }

        return Math.max(diameter(root),
                Math.max(diameterOfBinaryTree(root.left),
                        diameterOfBinaryTree(root.right)));
    }

    public int diameter(TreeNode root) {
        return height(root.left) + height(root.right) + 2;
    }

    private int height(TreeNode root) {
        if (root == null) {
            return -1;
        }

        return Math.max(height(root.left), height(root.right)) + 1;
    }
}