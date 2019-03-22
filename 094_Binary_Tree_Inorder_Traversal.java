
Binary Tree Inorder Traversal

Given a binary tree, return the inorder traversal of its nodes' values.

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
    public List<Integer> inorderTraversal(TreeNode root) {

        Deque<TreeNode> stack = new ArrayDeque();
        if(root == null){
            return orderList;
        }
        
        stack.add(root);
        while (stack.size()!=0) {
            TreeNode node = stack.peekFirst();
            if(node.left == null){
                orderList.add(node.val);
                stack.pollFirst();
                if(node.right != null){
                    stack.addFirst(node.right);
                }
            }else{
                stack.addFirst(node.left);
                node.left = null; // Cool!
            }
        }
    
        return orderList;        
    }
}

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
    public List<Integer> inorderTraversal(TreeNode root) {

        Deque<TreeNode> stack = new ArrayDeque<TreeNode>();
        if(root == null){
            return orderList;
        }
        
        while (root!=null || stack.size()!=0) {
            if(root != null){
                stack.addFirst(root);
                root = root.left;
            }else{
                root = stack.removeFirst();
                orderList.add(root.val);
                root = root.right;
            }
        }
        return orderList;        
    }
}