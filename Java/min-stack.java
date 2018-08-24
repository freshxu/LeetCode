class MinStack {

    /** initialize your data structure here. */
    Stack<Integer> allStack;
    Stack<Integer> minStack;
    
    public MinStack() {
        allStack = new Stack<Integer>();
        minStack = new Stack<Integer>();
    }
    
    public void push(int x) {
        if (allStack.isEmpty()) {
            allStack.push(x);
            minStack.push(x);
        } else {
            allStack.push(x);
            if (x <= minStack.peek()) {
                minStack.push(x);
            }
        }
    }
    
    public void pop() {
        if (allStack.peek().intValue() == minStack.peek().intValue()) {
            allStack.pop();
            minStack.pop();
        } else {
            allStack.pop();
        }
    }
    
    public int top() {
        return allStack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
 