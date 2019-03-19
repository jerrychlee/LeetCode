Swap Nodes in Pairs

Given a linked list, swap every two adjacent nodes and return its head.

You may not modify the values in the list's nodes, only nodes itself may be changed.

Example:

Given 1->2->3->4, you should return the list as 2->1->4->3.


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode pHead = dummy;
        
        while(pHead.next != null && pHead.next.next != null){

            ListNode first = pHead.next;
            ListNode second = pHead.next.next;
            
            first.next = second.next;
            second.next = first;
            pHead.next = second;
            
            pHead = first;

        }
        return dummy.next;
    }
}