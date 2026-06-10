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
    public boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> leftSide = new LinkedList<>();
        Queue<TreeNode> rightSide = new LinkedList<>();

        if(root == null) return true;
        leftSide.offer(root.left);
        rightSide.offer(root.right);

        while(!leftSide.isEmpty() || !rightSide.isEmpty()){
            TreeNode leftSideNode = leftSide.poll();
            TreeNode rightSideNode = rightSide.poll();

            if(leftSideNode == null && rightSideNode == null) continue;
            if(leftSideNode == null || rightSideNode == null) return false;
            if(leftSideNode.val != rightSideNode.val) return false;

            leftSide.offer(leftSideNode.left);
            leftSide.offer(leftSideNode.right);

            rightSide.offer(rightSideNode.right);
            rightSide.offer(rightSideNode.left);
        }

        return leftSide.size() == rightSide.size();
    }
}