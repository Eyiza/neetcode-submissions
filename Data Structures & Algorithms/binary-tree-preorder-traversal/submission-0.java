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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> traversal = new ArrayList<>();
        List<TreeNode> stack = new ArrayList<>();
        if (root == null) return traversal;
        stack.add(root);

        while (stack.size() > 0){
            TreeNode popped = stack.remove(stack.size() - 1);
            if (popped.right != null) stack.add(popped.right);
            if (popped.left != null) stack.add(popped.left);
            traversal.add(popped.val);
        }

        return traversal;
    }
}