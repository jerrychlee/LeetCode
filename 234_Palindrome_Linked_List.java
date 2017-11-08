/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        
        if(head==null || head.next==null)
            return true;

        Stack<ListNode> s = new Stack();
        ListNode p = head;
        while(p!=null){
            s.push(p);            
            p = p.next;
        }
        p = head;
        while(!s.empty()){
            if(s.pop().val!=p.val){
                return false;
            }
            p = p.next;
        }
        return true;
    }
}