/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* middle(ListNode* head){
        ListNode* slow = head;
        ListNode* fast = head;

        while(fast != NULL){
            fast = fast -> next;
            if(fast != NULL){
                fast = fast -> next;
                slow = slow -> next;
            }
        }
        return slow;
    }

    ListNode* reverse(ListNode* head){
        ListNode* prev = NULL;
        ListNode* curr = head;

        while(curr != NULL){
            ListNode* fwd = curr -> next;
            curr->next = prev;
            prev = curr;
            curr = fwd;
        }
        return prev;
    }
    int pairSum(ListNode* head) {
        ListNode* middleNode = middle(head);
        middleNode = reverse(middleNode);
        int maxSum = INT_MIN;

        while(middleNode != NULL){
            maxSum = max(maxSum,(head->val + middleNode->val));
            head = head->next;
            middleNode = middleNode->next;
        }
        return maxSum;
    }
};