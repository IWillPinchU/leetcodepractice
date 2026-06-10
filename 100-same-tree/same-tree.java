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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Queue<TreeNode> queue1 = new LinkedList<>();
        Queue<TreeNode> queue2 = new LinkedList<>();

        queue1.offer(p);
        queue2.offer(q);

        while(!queue1.isEmpty() || !queue2.isEmpty()){
            int levelSize = queue1.size();
            for(int i = 0; i<levelSize; i++){
                TreeNode tree1 = queue1.poll();
                TreeNode tree2 = queue2.poll();

                if(tree1 == null && tree2 == null) continue;

                if(tree1 == null || tree2 == null) return false;

                if(tree1.val != tree2.val) return false;

                queue1.offer(tree1.left);
                queue1.offer(tree1.right);
                queue2.offer(tree2.left);
                queue2.offer(tree2.right);
            }
        }

        return queue1.size() == queue2.size();
    }
}