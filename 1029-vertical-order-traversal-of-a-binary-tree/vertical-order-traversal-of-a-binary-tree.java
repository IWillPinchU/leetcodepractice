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
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        Map<Integer, List<Integer>> mappy = new TreeMap<>();
        Queue<Pair<TreeNode, Integer>> queue = new LinkedList<>();

        if(root == null) return new ArrayList<>();
        queue.offer(new Pair<>(root, 0));

        while(!queue.isEmpty()){
            Map<Integer, List<Integer>> levelMap = new HashMap<>();
            int levelSize = queue.size();

            for(int i = 0; i<levelSize; i++){
                Pair<TreeNode, Integer> currNode = queue.poll();
                TreeNode node = currNode.getKey();
                int column = currNode.getValue();

                levelMap.computeIfAbsent(column, k-> new ArrayList<>()).add(node.val);

                if(node.left != null) queue.offer(new Pair<>(node.left, column - 1));
                if(node.right != null) queue.offer(new Pair<>(node.right, column + 1));
            }

            for(Map.Entry<Integer, List<Integer>> entry: levelMap.entrySet()){
                List<Integer> values = entry.getValue();
                Collections.sort(values);
                mappy.computeIfAbsent(entry.getKey(), k -> new ArrayList<>()).addAll(values);
            }
        }

        return new ArrayList<>(mappy.values());
    }
}