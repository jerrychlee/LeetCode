class MyQueue {

    Stack<Integer> sA;
    Stack<Integer> sB;

    /** Initialize your data structure here. */
    public MyQueue() {
        sA = new Stack<Integer>();
        sB = new Stack<Integer>();
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        sA.push(x);
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if(sB.empty()){
            while(!sA.empty()){
                sB.push(sA.pop());
            }
        }
        
        return sB.pop();
    }
    
    /** Get the front element. */
    public int peek() {
        if(sB.empty()){
            while(!sA.empty()){
                sB.push(sA.pop());
            }
        }
        
        return sB.peek();
        
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        if(sB.empty()){
            while(!sA.empty()){
                sB.push(sA.pop());
            }
        }

        return sB.empty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */