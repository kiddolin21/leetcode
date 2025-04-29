class MyStack {
    Queue<Integer> q = new LinkedList<Integer>();
    Queue<Integer> tmp = new LinkedList<Integer>();
    // Push element x onto stack.
    public void push(int x) {
        while(!q.isEmpty())
            tmp.offer(q.poll());
        q.offer(x);
        while(!tmp.isEmpty())
            q.offer(tmp.poll());
    }

    // Removes the element on top of the stack.
    public void pop() {
        q.poll();
        
    }

    // Get the top element.
    public int top() {
        return q.peek();
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return q.isEmpty();
    }
}
