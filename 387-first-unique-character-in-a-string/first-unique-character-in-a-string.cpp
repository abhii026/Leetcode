class Solution {
public:
    int firstUniqChar(string s) {
        //  int freq[26] = {0};
        // for(int i = 0; i < s.size(); i++)
        //     freq[s[i] - 'a']++;
        // for(int i = 0; i < s.size(); i++)
        //     if(freq[s[i] - 'a'] == 1) return i;
        // return -1;
        int freq[26] = {0};
        queue<int> q;

        for(int i = 0; i < s.size(); i++){
            freq[s[i] - 'a']++;
            q.push(i);

            while(!q.empty() && freq[s[q.front()] - 'a'] > 1)
                q.pop();
        }

        if(q.empty()) return -1;
        return q.front();
    }
};