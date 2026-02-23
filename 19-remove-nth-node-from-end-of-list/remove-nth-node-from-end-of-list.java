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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length = 0;

        ListNode fast = head;
        ListNode dummy = new ListNode(0,head);
        ListNode prev = dummy;
        while(fast!=null){
            fast = fast.next;
            length++;
        }

        if(length-n<0) return head;
        for(int i=0; i<(length-n);i++){
            prev = prev.next;
        }
        ListNode curr = prev.next;
        prev.next = curr.next;

        return dummy.next;
    }
}