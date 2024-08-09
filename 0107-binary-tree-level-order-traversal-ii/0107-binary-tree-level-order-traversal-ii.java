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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) return ans;
        Queue<TreeNode> qu = new LinkedList<>();
        qu.add(root);

        while (!qu.isEmpty()) {
            List<Integer> level = new ArrayList<>();
            int size = qu.size();

            for (int i = 0; i < size; i++) {

                TreeNode current = qu.poll();
                level.add(current.val);

                if (current.left != null) qu.add(current.left);
                if (current.right != null) qu.add(current.right);
            }
            ans.add(0, level);
        }
        return ans;
    }
}