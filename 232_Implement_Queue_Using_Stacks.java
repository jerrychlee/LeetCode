class MyQueue {

    Stack<Integer> sIn;
    Stack<Integer> sOut;

    /** Initialize your data structure here. */
    public MyQueue() {
        sIn = new Stack<Integer>();
        sOut = new Stack<Integer>();
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        sIn.push(x);
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if(sOut.empty()){
            while(!sIn.empty()){
                sOut.push(sIn.pop());
            }
        }
        
        return sOut.pop();
    }
    
    /** Get the front element. */
    public int peek() {
        if(sOut.empty()){
            while(!sIn.empty()){
                sOut.push(sIn.pop());
            }
        }
        
        return sOut.peek();
        
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {

        return sIn.empty() && sOut.empty();
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