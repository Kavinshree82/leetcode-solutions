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
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null)
            return head;

        ListNode odd=head;        // Odd starts from first node   
        ListNode even=head.next;  // Even starts from second node
        ListNode evenHead=even;  // Save the head of even list(even joins with odd so)

        while(even!=null && even.next!=null)
        {
            // Link current odd node to next odd node
            odd.next=even.next;
            odd=odd.next;

            // Link current even node to next even node
            even.next=odd.next;
            even=even.next;
        }
        odd.next=evenHead;      // Connect odd list with even list

        return head;
    }
}