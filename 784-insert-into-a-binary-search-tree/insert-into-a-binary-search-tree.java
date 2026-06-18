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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null) return new TreeNode(val);
        insertIntoBSTfr(root,val);
        return root;
    }
    
    public void insertIntoBSTfr(TreeNode root, int val){
        if(val > root.val && root.right != null){
            insertIntoBSTfr(root.right, val);
            return;
        }
        else if(val < root.val && root.left != null) {
            insertIntoBSTfr(root.left, val);
            return;
        }
        if(val > root.val){
            root.right = new TreeNode(val);
        }
        else{
            root.left = new TreeNode(val);
        }
    }
}