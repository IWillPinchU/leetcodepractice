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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> result = new ArrayList<>();

        if(root == null) return result;
        queue.offer(root);

        boolean flag = true;

        while(!queue.isEmpty()){
            int levelSize = queue.size();
            List<Integer> levelResult = new ArrayList<>();
            for(int i = 0; i<levelSize; i++){
                TreeNode currNode = queue.poll();
                
                if(flag) levelResult.addLast(currNode.val);
                else levelResult.addFirst(currNode.val);

                if(currNode.left != null) queue.offer(currNode.left);
                if(currNode.right != null) queue.offer(currNode.right);
            }
            flag = !flag;
            result.add(levelResult);
        }

        return result;
    }
}