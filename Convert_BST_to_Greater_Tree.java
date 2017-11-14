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
    public TreeNode convertBST(TreeNode root) {
        Queue<TreeNode> que = new LinkedList<TreeNode>();
        if(root!=null){
            travesalTree(root, que);
        }
        int sum=0;
        while(que.peek()!=null){
            TreeNode node = que.remove();
            node.val+=sum;
            sum = node.val;
        }
        return root;
    }
    
    public void travesalTree(TreeNode root, Queue que) {
        if(root.right!=null)
            travesalTree(root.right, que);
        
        que.add(root);
        
        if(root.left!=null)
            travesalTree(root.left, que);
    }
}
