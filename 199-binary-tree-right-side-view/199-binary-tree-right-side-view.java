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
    public static List<Integer> ans;
    public List<Integer> rightSideView(TreeNode root) {
        ans=new ArrayList<>();
        helper(root,0);
        return ans;
    }
    public static void helper(TreeNode root,int level){
        if(root==null)return ;
        if(level==ans.size()){
            ans.add(root.val);
        }
        
        helper(root.right,level+1);
        helper(root.left,level+1);
    }
    
}