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
    public int max=0;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root!=null){
                max=Math.max(max,lengther(root.left)+lengther(root.right));
            diameterOfBinaryTree(root.left);
            diameterOfBinaryTree(root.right);
        }
        return max;
    }
    public int lengther(TreeNode root){
        if(root!=null){
                return 1+Math.max(lengther(root.left),lengther(root.right));
            }
        return 0;
    }
   
    
}