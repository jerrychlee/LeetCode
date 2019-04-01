102. Binary Tree Level Order Traversal

Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).

For example:
Given binary tree [3,9,20,null,null,15,7],
    3
   / \
  9  20
    /  \
   15   7
return its level order traversal as:
[
  [3],
  [9,20],
  [15,7]
]


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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> qA = new ArrayDeque<TreeNode>();
        Queue<TreeNode> qB = new ArrayDeque<TreeNode>(); 
        List<List<Integer>> out = new ArrayList<List<Integer>>();
        
        if(root == null)
            return out;
        
        qA.add(root);
        
        Queue<TreeNode> q1 = qA;
        Queue<TreeNode> q2 = qB;
        while(!q1.isEmpty() || !q2.isEmpty()){
            List<Integer> list = new ArrayList<Integer>();
            Queue<TreeNode> temp = null;
            while(!q1.isEmpty()){
                TreeNode node = q1.remove();
                list.add(node.val);
                if(node.left!=null){
                    q2.add(node.left);
                }
                if(node.right!=null){
                    q2.add(node.right);
                }
            }
            out.add(list);
            temp = q1;
            q1 = q2;
            q2 = temp;
        }
        return out;
    }
}