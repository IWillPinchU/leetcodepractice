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
    public ListNode deleteMiddle(ListNode head) {
        ListNode biggy = new ListNode(0,head);
        ListNode slow = head;
        ListNode fast = head;

        if(head.next == null){
            return null;
        }

        while(fast!=null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            biggy = biggy.next;
        }

        biggy.next = slow.next;
        slow.next = null;
        return head;
    }
}