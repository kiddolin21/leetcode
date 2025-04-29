class MyQueue {
    Stack<Integer> stackNewest = new Stack<Integer>();
    Stack<Integer> stackOldest = new Stack<Integer>();
    // Push element x to the back of queue.
    public void push(int x) {
        stackNewest.push(x);
    }

    // Removes the element from in front of queue.
    public void pop() {
        shiftStacks();
        stackOldest.pop();
    }

    // Get the front element.
    public int peek() {
        shiftStacks();
        return stackOldest.peek();
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return stackOldest.isEmpty() && stackNewest.isEmpty();
    }
    
    private void shiftStacks() {
        if(stackOldest.isEmpty()) 
            while(!stackNewest.isEmpty()) 
                stackOldest.push(stackNewest.pop());
    }
}
