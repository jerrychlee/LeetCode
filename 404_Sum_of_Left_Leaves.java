/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int sumOfLeftLeaves(TreeNode root) {

        if(root==null){
            return 0;
        }
        
        return dfs(root.left, 0) + dfs(root.right, 1);
        
    }
    
    public int dfs(TreeNode root, int type){
        
        if(root==null){
            return 0;
        }
        
        if(root.left==null && root.right==null){
            return type==0? root.val:0;
        }
        
        return dfs(root.left, 0) + dfs(root.right, 1);
    }
}