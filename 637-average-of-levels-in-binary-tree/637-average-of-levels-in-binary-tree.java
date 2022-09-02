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
    List<Double> ans=new ArrayList<>();
    public List<Double> averageOfLevels(TreeNode root) {
        if(root==null)return ans;
        Queue<TreeNode> q= new LinkedList<>();
        q.offer(root);
          double levelSum=0;
        while(!q.isEmpty()){
           levelSum=0;
               int sz=q.size();
              for( int i=0;i<sz;i++){
                    TreeNode temp=q.poll();
                    levelSum+=temp.val;
                    if(temp.left!=null)q.offer(temp.left);
                    if(temp.right!=null)q.offer(temp.right);
                }
          double answer=levelSum/sz; 
            ans.add(answer);
        }
        return ans;
    }
}