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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> a - b );

        for(ListNode l:lists){
            while(l != null){
                pq.offer(l.val);
                l = l.next;
            }
        }

        ListNode dummy = new ListNode();
        ListNode head = dummy;
        while(pq.peek() != null){
            head.next= new ListNode(pq.poll());
            head = head.next;
        }

        return dummy.next;
    }

    
}