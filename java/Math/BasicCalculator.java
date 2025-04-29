public int calculate(String s) {
        if(s == null || s.length() == 0) return 0;
        int res = 0;
        int sign = 1;
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        char[] c = s.toCharArray();
        for(int i = 0; i < c.length; i++) {
            if(c[i] == ' ') continue;
            if(c[i] == '(') {
                stack.push(stack.peek() * sign);
                sign = 1;
            }
            else if(c[i] == ')') stack.pop();
            else if(c[i] == '+') sign = 1;
            else if(c[i] == '-') sign = -1;
            else if(Character.isDigit(c[i])) {
                int num = c[i] - '0';
                while(i < c.length - 1 && Character.isDigit(c[i + 1])) {
                    num = num * 10 + c[i + 1] - '0';
                    i++;
                }
                res += sign * stack.peek() * num;
            }
        }
        return res;
    }
