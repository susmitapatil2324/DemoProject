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
       // Step 1: Calculate the length of the linked list
        int length = 0;
        ListNode current = head;
        while (current != null) {
            length++;
            current = current.next;
        }

        // Step 2: Find the middle index
        int middleIndex = length / 2;

        // Step 3: Traverse to the middle index
        current = head;
        for (int i = 0; i < middleIndex; i++) {
            current = current.next;
        }

        // Step 4: Return the middle node
        return current;
    }
}

