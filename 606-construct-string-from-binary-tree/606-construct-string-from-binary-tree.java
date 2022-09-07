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
    public String tree2str(TreeNode root) {
        if(root==null)return "";
        String inner=""+root.val;
        String left=tree2str(root.left);
        if(!left.equals(""))inner+="("+left+")";
        String right=tree2str(root.right);
        if(left.equals("")&&!right.equals(""))inner+="()"+"("+right+")";
        else if(!right.equals(""))inner+="("+right+")";
        return inner;
       
    }
//     public String helper(TreeNode root){
//         if(root==null)return "";
        
//     }
}