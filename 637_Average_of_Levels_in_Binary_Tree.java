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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> list = new LinkedList();
        Queue<Pair> que = new LinkedList(); 
        
        double sum = 0;
        int current = 0;
        int count = 0;
        
        if(root!=null){
            que.add(new Pair(root, 0));
        }
        
        while(que.peek()!=null){
            Pair p = que.poll();
            if(p.level == current){
                sum += p.node.val;
                count++;
            }else{
                list.add(sum/count);
                sum = p.node.val;
                count = 1;
                current = p.level;
            }
            
            if(p.node.left!=null){
                que.add(new Pair(p.node.left, p.level+1));
            }
            if(p.node.right!=null){
                que.add(new Pair(p.node.right, p.level+1));
            }
        }
        
        list.add(sum/count);        
        
        return list;
    }
     
    private class Pair {
       int level;
       TreeNode node;
       Pair(TreeNode node, int level) { this.level = level; this.node = node;}
    }  
}
    