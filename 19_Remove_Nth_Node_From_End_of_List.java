19. Remove Nth Node From End of List
Medium

Given a linked list, remove the n-th node from the end of list and return its head.

Example:

Given linked list: 1->2->3->4->5, and n = 2.

After removing the second node from the end, the linked list becomes 1->2->3->5.
Note:

Given n will always be valid.

Follow up:

Could you do this in one pass?

=================================================
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        if(head == null)
            return null;
        
        if(head.next == null && n ==1){
            head = null;
            return null;
        }
            
        ListNode p = head;
        int count = 1;
        while(p.next!=null){
            count++;
            p = p.next;
        }
        
        p = head;
        if((count-n)==0){
            head = head.next;
            return head;
        }
            
        for(int i=0; i<(count-n-1); i++){
            p = p.next;
        }
        
        p.next = p.next.next;
 
        return head;
    }
}

