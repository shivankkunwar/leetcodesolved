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
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        if(root==null)return new ArrayList<List<Integer>>();
        List<List<Integer>> ret= new ArrayList<List<Integer>>();
          ArrayList<Integer> ans= new ArrayList<>();
        Queue <TreeNode> q= new LinkedList<TreeNode>();
        q.add(root);
        q.add(null);
        while(q.size()>1||ans.size()!=0){
          
            TreeNode curr=q.poll();
            if(curr==null){
                ret.add(ans);
                ans= new ArrayList<>();
                q.add(null);
                continue;
            }
            ans.add(curr.val);
            if(curr.left!=null)q.add(curr.left);
            if(curr.right!=null)q.add(curr.right);
        }
        return ret;
    }
}