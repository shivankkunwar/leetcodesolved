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
    int ans;
    public int goodNodes(TreeNode root) {
            if(root==null)ans=0;
            else ans=1;
            helper(root.left,root.val);
            helper(root.right,root.val);
            return ans;
    }
    public void helper(TreeNode root,int max){
        if(root==null)return;
         if(root.val>=max){
            ans++;
            max=root.val;
        }
        helper(root.left,max);
       
        helper(root.right,max);
        
    } 
}