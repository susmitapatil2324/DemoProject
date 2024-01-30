/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {

     // Floyds cycle detection Algo
    public ListNode detectCycle(ListNode head) {
       // Create two pointer fast and slow
        ListNode fast = head;
        ListNode slow = head;

        while(fast!=null && fast.next!=null)
        {
           fast = fast.next.next;
           slow = slow.next;

           if(fast==slow)
           {
              while(head!=slow)
              {
               slow = slow.next;
               head = head.next;
              }
              return slow;
           }
        }
        return null;
    }
}