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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root==null)return false;
        if(checker(root,subRoot))return true;
        return isSubtree(root.left,subRoot)||isSubtree(root.right,subRoot); 
    }
    public boolean checker(TreeNode one,TreeNode two){
       if(one==null||two==null)return one==two;
        return one.val==two.val&&checker(one.left,two.left)&&checker(one.right,two.right);
    }
}