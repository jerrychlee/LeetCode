144. Binary Tree Preorder Traversal

Given a binary tree, return the preorder traversal of its nodes' values.

Example:

Input: [1,null,2,3]
   1
    \
     2
    /
   3

Output: [1,2,3]


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
    List<Integer> orderList = new ArrayList();
    public List<Integer> preorderTraversal(TreeNode root) {

        Deque<TreeNode> stack = new ArrayDeque<TreeNode>();
        if(root == null){
            return orderList;
        }
        
        stack.addFirst(root);
        
        while (stack.size()!=0) {
            root = stack.removeFirst();
            orderList.add(root.val);
            if(root.right != null){
                stack.addFirst(root.right);        
            }

            if(root.left != null){
                stack.addFirst(root.left);        
            }
        }
    
        return orderList;        
    }        
}