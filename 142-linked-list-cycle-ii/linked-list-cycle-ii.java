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

    public ListNode detectCycle(ListNode head) {
        ListNode temp = head;
        Set<ListNode> set = new HashSet<ListNode>();

        while(temp!=null && temp.next!=null)
        {
            if(set.contains(temp))
            {
              return temp;
            }
            set.add(temp);
            temp = temp.next;
        }
       
       return null;
    }
}