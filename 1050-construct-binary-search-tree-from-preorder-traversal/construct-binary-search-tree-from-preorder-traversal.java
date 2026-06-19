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
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root = new TreeNode();
        for(int element: preorder){
            insertIntoBST(element, root);
        }
        return root.right;
    }

    public TreeNode insertIntoBST(int element, TreeNode root){
        if(root == null) return new TreeNode(element);
        if(element > root.val) root.right = insertIntoBST(element, root.right);
        else root.left = insertIntoBST(element, root.left);
        return root;
    }
}