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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> out = new ArrayList();
        if(root==null)
            return out;
        
        String s = "";
        
        findPath(root, s, out);
        
        return out;
    }
    
    public void findPath(TreeNode root, String s, List<String> out){
        
        if(root.left==null && root.right==null){
            out.add(s.concat(Integer.toString(root.val)));
        }
        
        if(root.left!=null){
            String sLeft = "";
            sLeft = s.concat(Integer.toString(root.val).concat("->"));
            findPath(root.left, sLeft, out);
        }
        
        if(root.right!=null){
            String sRight = "";
            sRight = s.concat(Integer.toString(root.val).concat("->")); ;
            findPath(root.right, sRight, out);
        }
    }
}
