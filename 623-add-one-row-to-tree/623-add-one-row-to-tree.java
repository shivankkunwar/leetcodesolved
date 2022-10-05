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
    public TreeNode addOneRow(TreeNode root, int v, int d) {
         if (d == 1) {
            TreeNode newRoot = new TreeNode(v);
            newRoot.left = root;
            return newRoot;
        }
        // find nodes in depth d-1
        Queue<TreeNode> queue = new LinkedList();
        queue.offer(root);
        while (--d > 1) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (node.left != null)  queue.offer(node.left);
                if (node.right != null)  queue.offer(node.right);
            }
        }
        // create new left and right for nodes in depth d-1
        for (TreeNode node : queue) {
            TreeNode left = node.left, right = node.right;
            TreeNode newLeft = new TreeNode(v), newRight = new TreeNode(v);
            node.left = newLeft;
            node.right = newRight;
            newLeft.left = left;
            newRight.right = right;
        }
        
        return root;
    }
}