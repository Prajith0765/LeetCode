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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return revsum(l1,l2);
    }

    public ListNode revsum(ListNode l1, ListNode l2){
        if(l1 == null && l2 == null){
            return null;
        }
        if(l1 == null){
            l1 = new ListNode(0); 
        }
        if(l2 == null){
            l2 = new ListNode(0);
        }
        int val = l1.val + l2.val;
        if(val > 9){
            val = val % 10;
            if(l1.next == null){
                l1.next = new ListNode(1);
            }
            else{
                l1.next.val = l1.next.val + 1;
            }
        }
        return new ListNode(val, revsum(l1.next, l2.next));
    }
}