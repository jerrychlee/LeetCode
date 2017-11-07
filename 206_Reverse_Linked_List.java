/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode h = head;
        ListNode p = head;
        while(p!=null && p.next!=null){
            ListNode pp = p.next;
            p.next = pp.next;
            pp.next = h;
            h = pp;
        }
        
        return h;
    }
}