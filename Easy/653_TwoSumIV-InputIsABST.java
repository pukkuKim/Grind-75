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
// My Solution: simply terrible ;)
class Solution {
    public boolean findTarget(TreeNode root, int k) {
        // 1. store all node values in a list
        // 2. traverse and see if the current node's complement is in the list
        // 3. return true if yes
        // 4. return false (at the end)

        Stack<TreeNode> stack = new Stack<>();
        List<Integer> values = new ArrayList<>();

        stack.add(root);

        // 1. store all node values in a list
        while (!stack.isEmpty()) {
            TreeNode popped = stack.pop();
            values.add(popped.val);
            if (popped.left != null) {
                stack.add(popped.left);
            }
            if (popped.right != null) {
                stack.add(popped.right);
            }
        }

        // 2. traverse and see if the current node's complement is in the list
        for (int i = 0; i < values.size(); i++) {
            // 3. return true if yes
            int complement = k - values.get(i);
            if (values.contains(complement) && values.indexOf(complement) != i) {
                return true;
            }
        }

        // 4. return false (at the end)
        return false;
    }
}

// My Favourite LC Solution (Approach #3: Using BST)
//public class Solution {
//    public boolean findTarget(TreeNode root, int k) {
//        List < Integer > list = new ArrayList();
//        inorder(root, list);
//        int l = 0, r = list.size() - 1;
//        while (l < r) {
//            int sum = list.get(l) + list.get(r);
//            if (sum == k)
//                return true;
//            if (sum < k)
//                l++;
//            else
//                r--;
//        }
//        return false;
//    }
//    public void inorder(TreeNode root, List < Integer > list) {
//        if (root == null)
//            return;
//        inorder(root.left, list);
//        list.add(root.val);
//        inorder(root.right, list);
//    }
//}