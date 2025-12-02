class MyQueue {
public:
    stack<int> in;
    stack<int> out;
    int pekEl=-1;
    MyQueue() {
        
    }
    
    void push(int x) {
        if(in.empty()){
            pekEl=x;
        }
        in.push(x);
        
    }
    
    int pop() {
        if(out.empty()){
            while(!in.empty()){
                out.push(in.top());
                in.pop();
            }
        }
        int val=out.top();
        out.pop();
        return val;
        // if(!out.empty()){
        //     int val=out.top();
        //     out.pop();
        //     return val;
        // }
        // else{
        //     while(!in.empty()){
        //         out.push(in.top());
        //         in.pop();
        //     }
        //     // return out.top();
        // }
        // return -1;
    }
    
    int peek() {
        if(!out.empty()){
            return out.top();
        }
        else{
            // while(!in.empty()){
            //     out.push(in.top());
            //     in.pop();
            // }
            // return out.rop();
            return pekEl;

        }
    }
    
    bool empty() {
        return out.empty() && in.empty();
    }
};

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue* obj = new MyQueue();
 * obj->push(x);
 * int param_2 = obj->pop();
 * int param_3 = obj->peek();
 * bool param_4 = obj->empty();
 */