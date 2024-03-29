/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head;
        ListNode slow = head;

        for(int i=1;i<=n;i++)
        {
           fast= fast.next;
        }
         
        ListNode prev = null;

        while(fast!=null)
        {
          prev = slow;
          slow = slow.next;
          fast = fast.next;
        }
       
       if(prev!=null)
       {
         prev.next = slow.next;
       }else
       {
           return head.next;
       }
      return head;
    }
}