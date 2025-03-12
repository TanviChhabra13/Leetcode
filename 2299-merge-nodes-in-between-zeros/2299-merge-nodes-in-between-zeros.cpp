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
    ListNode* mergeNodes(ListNode* head) {
        ListNode* dummy = new ListNode(0);
        ListNode* curr = dummy;
        ListNode* temp = head;
        int sum = 0, count = 0;
        while (temp != NULL) {
            if (temp->val == 0 && count < 1) {
                count++;
            } else if (temp->val == 0 && count >= 1) {
                ListNode* node = new ListNode(sum);
                curr->next = node;
                curr = node;
                count = 1;
                sum = 0;
            }
            if (count == 1) {
                sum += temp->val;
            }
            temp = temp->next;
        }
        return dummy->next;
    }
};