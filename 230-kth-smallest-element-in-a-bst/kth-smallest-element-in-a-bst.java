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
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> ordered = new ArrayList<>();
        inOrderTraversal(root, ordered);
        return ordered.get(k - 1);
    }

    public void inOrderTraversal(TreeNode root, List<Integer> result){
        if(root.left != null){
            inOrderTraversal(root.left, result);
        }
        result.add(root.val);
        if(root.right != null){
            inOrderTraversal(root.right, result);
        }
    }
}