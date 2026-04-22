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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> traversal = new ArrayList<>();
        List<TreeNode> stack = new ArrayList<>();
        TreeNode current = root;

        while (current != null || stack.size() > 0){
            while (current != null){
                stack.add(current);
                current = current.left;
            }
            current = stack.remove(stack.size() - 1);
            traversal.add(current.val);
            current = current.right;
        }
        return traversal;
    }
}