public int largestRectangleArea(int[] height) {
        if(height == null || height.length == 0) return 0;
        int max = 0, i = 0;
        Stack<Integer> stack = new Stack<Integer>();
        
        while(i < height.length) {
            
            if(stack.isEmpty() || height[i] >= height[stack.peek()]) {
                stack.push(i);
                i++;
            } else {
                int p = stack.pop();
                int h = height[p];
                int w = stack.isEmpty()? i : i - stack.peek() - 1;
                max = Math.max(max, h * w);
            }
        }
        
        while(!stack.isEmpty()) {
            int p = stack.pop();
            int h = height[p];
            int w = stack.isEmpty()? i : i - stack.peek() - 1;
            max = Math.max(max, h * w);
        }
        return max;
    }
