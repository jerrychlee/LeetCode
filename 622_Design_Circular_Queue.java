class MyCircularQueue {

    /** Initialize your data structure here. Set the size of the queue to be k. */
    int []array;
    int length = 0;
    int front = 0;
    int rear = -1;
    
    public MyCircularQueue(int k) {
        array = new int[k];
    }
    
    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
        if(isFull()){
            return false;
        }else{
            rear = (rear+1) % array.length;
            array[rear] = value;
            length++;
            return true;
        }
    }
    
    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
        if(isEmpty()){
            return false;
        }else{
            array[front] = -1;
            front = (front+1)%array.length;
            length--;
            return true;
        }
    }
    
    /** Get the front item from the queue. */
    public int Front() {
        if(isEmpty()){
            return -1;            
        }
        else{
            return array[front];        
        }
    }
    
    /** Get the last item from the queue. */
    public int Rear() {
        if(isEmpty()){
            return -1;            
        }else{
            return array[rear];        
        }
    }
    
    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
        return (length==0)? true:false;
    }
    
    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
        return (length==array.length)? true:false;        
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */