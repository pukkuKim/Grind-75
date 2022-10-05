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
    // My approach: Top-down recursion
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }

        // can join the "if" and "else" statements w/ &&
        // (need to change > 1 to < 2)
        // and then return "true"
        if (Math.abs(height(root.left) - height(root.right)) > 1) {
            return false;
        } else {
            return isBalanced(root.left) && isBalanced(root.right);
        }
    }

    private int height(TreeNode root) {
        if (root == null) {
            return -1;
        }

        return Math.max(height(root.left), height(root.right)) + 1;
    }
}