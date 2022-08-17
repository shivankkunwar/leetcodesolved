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
    public List<Integer> ans;
    public int maxLevel=0;
    public List<Integer> rightSideView(TreeNode root) {
        ans=new ArrayList<>();
        helper(root,1);
        return ans;
    }
    public  void helper(TreeNode root,int level){
        if(root==null)return ;
        // if(level==ans.size()){
        //     ans.add(root.val);
        // }
        if(level>maxLevel){
            ans.add(root.val);
            maxLevel=level;
        }
        
        helper(root.right,level+1);
        helper(root.left,level+1);
    }
    
}