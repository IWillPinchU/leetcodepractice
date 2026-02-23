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
    public int pairSum(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = reverse(slow.next);

        slow = head;
        fast = head;
        while(fast!=null  && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        int maxSum = 0;
        while(slow !=null){
            int currSum = head.val + slow.val;
            if(currSum > maxSum) maxSum = currSum;
            slow = slow.next;
            head = head.next;
        }
        return maxSum;
    }
    public ListNode reverse(ListNode curr){
        ListNode prev = null;
        while(curr!=null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}