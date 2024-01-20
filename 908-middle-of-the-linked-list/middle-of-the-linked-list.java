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

    public ListNode middleNode(ListNode head) {
        int len = 0;
       ListNode temp = head;
       ListNode temp1 = head;
       
       int mid =0;

       while(temp!=null)
       {
         len++;  
         temp = temp.next;  
       }

       System.out.println("Len is:"+len);

       mid = len/2;

       System.out.println("Mid is :"+mid);

       int count =0;

       while(count<mid)
       {
         count++;
         temp1= temp1.next;
       }
        return temp1;
    }
}

