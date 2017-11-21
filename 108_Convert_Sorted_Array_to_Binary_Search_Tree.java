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
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums==null || nums.length==0)
            return null;
        
        int low = 0;
        int high = nums.length-1;
        
        return makeTree(nums, low, high);
    }
    
    private TreeNode makeTree(int[] nums, int low, int high){
        
        if(low>high){
            return null;
        }

        TreeNode root = new TreeNode(nums[(high+low)/2]);
        root.left = makeTree(nums, low, (high+low)/2-1);
        root.right = makeTree(nums, (high+low)/2+1, high);
        
        return root;
    }
}