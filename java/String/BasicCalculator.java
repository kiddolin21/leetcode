public int calculate(String s) {
        if(s == null || s.length() < 1) return 0;
        Stack<Integer> stack = new Stack<Integer>();
        int res = 0, num = 0;
        char sign = '+';
        
        for(int i = 0; i < s.length(); i++) {
            if(Character.isDigit(s.charAt(i))) {
                num = num * 10 + s.charAt(i) - '0';
            }
            if((!Character.isDigit(s.charAt(i)) && s.charAt(i) != ' ') || i == s.length() - 1) {
                if(sign == '+') stack.push(num);
                else if(sign == '-') stack.push(- num);
                else if(sign == '*') stack.push(stack.pop() * num);
                else if(sign == '/') stack.push(stack.pop() / num);
                num = 0;
                sign = s.charAt(i);
            }
        }
        for(int i: stack) res += i;
        return res;
    }
