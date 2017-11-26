/****************************************************/
/* Version 1 - More efficent                        */
/****************************************************/
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
    public boolean isBalanced(TreeNode root) {
        
        if(root==null)
            return true;
        
        return (treeHeight(root )!=-1) ? true:false;
        
    }
    
    static int treeHeight(TreeNode root){
        
        if(root==null)
            return 0;
        
        int l = treeHeight(root.left);
        
        if(l==-1)
            return -1;
        
        int r = treeHeight(root.right);
        
        if(r==-1)
            return -1;
        
        if(Math.abs(l-r)>1)
            return -1;
        
        return Math.max(l,r)+1;
        
    }
}

/****************************************************/
/* Version 2                                        */
/****************************************************/
class Solution {
    public boolean isBalanced(TreeNode root) {
        
        if(root==null)
            return true;
        
        if(root.left==null && root.right==null)
            return true;
        
        int l=0;
        int r=0;
        if(root.left!=null)
            l=treeHeight(root.left);
        if(root.right!=null)
            r=treeHeight(root.right);
        
        if(isBalanced(root.left)&&isBalanced(root.right))
            return Math.abs(l-r)<=1 ? true:false;
        else
            return false;
    }
    
    static int treeHeight(TreeNode root){
        
        if(root==null)
            return 0;
        
        if(root.left==null && root.right==null)
            return 1;
        
        return Math.max(treeHeight(root.left),treeHeight(root.right))+1;
        
    }
}
