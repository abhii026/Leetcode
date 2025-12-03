class Solution {
public:
    int countStudents(vector<int>& students, vector<int>& sandwiches) {
        queue<int> q;
        stack<int> st;
        for(int i = sandwiches.size() - 1; i >= 0; i--) st.push(sandwiches[i]);
        for(int x : students) q.push(x);

        int count = 0;
        while(!q.empty() && !st.empty()){
            if(q.front() == st.top()){
                q.pop();
                st.pop();
                count = 0;
            } else {
                q.push(q.front());
                q.pop();
                count++;
            }
            if(count == q.size()) break;
        }
        return q.size();

    }
};