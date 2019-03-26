145. Binary Tree Postorder Traversal

Given a binary tree, return the postorder traversal of its nodes' values.

Example:

Input: [1,null,2,3]
   1
    \
     2
    /
   3

Output: [3,2,1]


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
    public List<Integer> postorderTraversal(TreeNode root) {
        Deque<TreeNode> stack = new ArrayDeque<TreeNode>();
        if(root==null)
            return orderList;
        while(root!=null || stack.size()!=0){
            if(root!=null){
                orderList.add(0, root.val);
                if(root.left!=null){
                    stack.addFirst(root.left);                
                }
                root = root.right;
            }else{
                root = stack.removeFirst();
            }
        }
        return orderList;
    }
}