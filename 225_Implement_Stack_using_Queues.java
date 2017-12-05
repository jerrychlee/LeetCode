class MyStack {
    
    Queue<Integer> q = null;
    int count = 0;
    
    /** Initialize your data structure here. */
    public MyStack() {
        q = new LinkedList();
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        q.add(x);
        count++;
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        
        for(int i=0; i<count-1; i++){
            q.add(q.poll());
        }
        
        count--;
        
        return q.poll();
        
    }
    
    /** Get the top element. */
    public int top() {
        
        for(int i=0; i<count-1; i++){
            q.add(q.poll());
        }
        
        int a = q.peek();
        q.add(q.poll());
        
        return a;
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        
        if(count==0)
            return true;
        else
            return false;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
