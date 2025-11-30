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
    ListNode* reverseList(ListNode* head) {
        ListNode* temp=head;
        vector<int> v;
        while(temp!=NULL){
            v.push_back(temp->val);
            temp=temp->next;
        }
        int start=0;
        int end=v.size()-1;
        while(start<end){
            int temp=v[start];
            v[start]=v[end];
            v[end]=temp;
            start++;
            end--;
        }
        temp=head;
        int i=0;
        while(temp){
            temp->val=v[i++];
            temp=temp->next;
        }
        return head;
    }
};