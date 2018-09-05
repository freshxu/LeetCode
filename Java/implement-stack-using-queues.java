class MyStack {

    /** Initialize your data structure here. */
    public MyStack() {
        list = new ArrayList();
    }
    
    List<Integer> list;
    
    /** Push element x onto stack. */
    public void push(int x) {
        list.add(x);
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        int result = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        return result;
    }
    
    /** Get the top element. */
    public int top() {
        return list.get(list.size() - 1);
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return list.size() == 0;
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
 