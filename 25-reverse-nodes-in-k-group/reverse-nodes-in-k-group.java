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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0,head);
        ListNode prev = dummy;

        while(true){
            ListNode tracker = prev;
            for(int i=1; i<=k; i++) {
                tracker = tracker.next;
                if(tracker == null) return dummy.next;
            }

            ListNode curr = prev.next;
            for(int i=1; i<k; i++){
                ListNode next = curr.next;
                curr.next = next.next;
                next.next = prev.next;
                prev.next = next;
            }
            prev = curr;
        }
    }
}