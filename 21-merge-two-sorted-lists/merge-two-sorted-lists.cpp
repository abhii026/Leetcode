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
    ListNode* mergeTwoLists(ListNode* list1, ListNode* list2) {
        ListNode* temp1=list1;
        vector<int> v1;
        while(temp1){
            v1.push_back(temp1->val);
            temp1=temp1->next;
        }
        ListNode* temp2=list2;
        vector<int> v2;
        while(temp2){
            v2.push_back(temp2->val);
            temp2=temp2->next;
        }
        int p1=0;
        int p2=0;
        int n=v1.size();
        int m=v2.size();
        vector<int> v3;
        while(p1<n && p2<m){
            if(v1[p1]<=v2[p2]){
                v3.push_back(v1[p1++]);
            }
            else{
                v3.push_back(v2[p2++]);
            }
        }
        while(p1<n){
            v3.push_back(v1[p1++]);
        }
        while(p2<m){
            v3.push_back(v2[p2++]);
        }
        ListNode dummy;
        ListNode* curr = &dummy;

        for (int x : v3) {
            curr->next = new ListNode(x);
            curr = curr->next;
        }

        return dummy.next;
    }
};