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
        if (head == null || left == right) return head;

        ListNode dummy = new ListNode(0); // Dummy node to handle edge cases
        dummy.next = head;
        ListNode prev = dummy;

        // Step 1: Move `prev` to the node before `left`
        for (int i = 1; i < left; i++) {
            prev = prev.next;
        }

        // Step 2: Reverse sublist from `left` to `right`
        ListNode curr = prev.next;
        ListNode nextNode;
        ListNode prevNode = null;

        for (int i = 0; i <= right - left; i++) {
            nextNode = curr.next;
            curr.next = prevNode;
            prevNode = curr;
            curr = nextNode;
        }

        // Step 3: Reconnect reversed sublist
        prev.next.next = curr; // Connect end of reversed part to remaining list
        prev.next = prevNode; // Connect start of reversed part to previous part

        return dummy.next; // Return the updated list
    }
}
