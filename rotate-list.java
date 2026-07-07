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
    public ListNode rotateRight(ListNode head, int k) 
    {
        if (head == null || head.next == null || k == 0)
            return head;

        //Find the length of the list and the last node    
        ListNode tail=head;
        int length=1;

        while(tail.next!=null)
        {
            tail=tail.next;
            length++;
        }

        //Reduce unnecessary rotations
        k=k%length;

        // If k becomes 0, the list remains unchanged
        if(k==0)
            return head;

        // Make the linked list circular  
        tail.next=head;

        //Find the new tail
        int steps = length - k - 1;

        ListNode newTail = head;

        for (int i = 0; i < steps; i++) {
            newTail = newTail.next;
        }

        ListNode newHead = newTail.next;
         newTail.next = null;

        return newHead;
    }
}