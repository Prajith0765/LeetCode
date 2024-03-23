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
    public void reorderList(ListNode head) {
       if(head.next != null && head != null) {
       ListNode slow = head;
       ListNode fast = head.next;
       while(fast.next != null && fast.next.next != null){
        slow = slow.next;
        fast = fast.next.next;
       } 
       if(fast.next != null){
        slow = slow.next;
       }
       ListNode temp = slow.next;
       ListNode newHead = temp;
       slow.next = null;
       newHead = reverse(newHead, null);
       
       ListNode curr = head;
       while(newHead != null){
        ListNode node = curr.next;
        curr.next = newHead;
        newHead = node;
        curr = curr.next;
       }
    }
    }
    public ListNode reverse(ListNode head, ListNode prev){
        if(head == null) return prev;
        ListNode newHead = head.next;
        head.next = prev;
        return reverse(newHead, head);
    }
}
