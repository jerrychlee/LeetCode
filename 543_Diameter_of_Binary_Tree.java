/***************************/
/* Reference from shawngao */
/***************************/

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
    
    int max = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        
        if(root==null)
            return 0;
        
        maxdeep(root);
        
        return max;
    }
    
    private int maxdeep(TreeNode root){
        
        if(root==null)
            return 0;
        
        int left = maxdeep(root.left);
        int right = maxdeep(root.right);
        
        max = Math.max(max, left + right);
        
        return Math.max(left,right)+1;
        
    }
}
