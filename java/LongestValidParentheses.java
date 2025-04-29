public int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<Integer>();
        int max = 0, len = 0;
        for(char c : s.toCharArray()) {
            if(c == '(') {
                stack.push(len);
                len = 0;
            }
            else {
                if(stack.empty()) {
                    len = 0;
                }
                else {
                    len += stack.pop() + 2;
                    max = Math.max(max,len);
                }
            }
        }
        return max;
    }
