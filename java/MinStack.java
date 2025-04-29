class MinStack {
    Stack<Long> stack;
    long min;

    MinStack() {
        stack = new Stack<Long>();
    }
    
    public void push(int x) {
        if(stack.isEmpty()) {
            stack.push(0L);
            min = x;
        } else {
            stack.push(x - min);
            if(x < min) min = x;
        }
    }

    public void pop() {
        if(stack.isEmpty()) return;
        long pop = stack.pop();
        if(pop < 0) min = min - pop;
    }

    public int top() {
        long top = stack.peek();
        if(top < 0) return (int)min;
        else return (int)(min + top);
        
    }

    public int getMin() {
        return (int) min;
    }
}

