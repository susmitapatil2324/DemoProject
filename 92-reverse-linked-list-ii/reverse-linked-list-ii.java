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
    public ListNode reverseBetween(ListNode head, int left, int right) {

      if(head.next==null || head==null)
      {
          return head;
      }
      ListNode dummy = new ListNode(0);
      dummy.next = head;
      
      ListNode nodeBeforeSubList = dummy;

      for(int i=0;i<left-1;i++)
      {
        nodeBeforeSubList = nodeBeforeSubList.next;
      }
      ListNode workingpt = nodeBeforeSubList.next;

      for(int i=0;i<right-left;i++)
      {
         ListNode nodeToBeExacted = workingpt.next;
         workingpt.next = nodeToBeExacted.next;
         nodeToBeExacted.next = nodeBeforeSubList.next;
         nodeBeforeSubList.next = nodeToBeExacted;
      }

     return dummy.next;
    }
}