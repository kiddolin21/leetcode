public int calculate(String s) {
        Deque<Integer> stack = new LinkedList<>();
        int rs = 0;
        int sign = 1;
        stack.push(1);
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == ' ') continue;
            else if (s.charAt(i) == '('){
                stack.push(stack.peekFirst() * sign);
                sign = 1;
            }
            else if (s.charAt(i) == ')') stack.pop();
            else if (s.charAt(i) == '+') sign = 1;
            else if (s.charAt(i) == '-') sign = -1;
            else{
                int temp = s.charAt(i) - '0';
                while (i + 1 < s.length() && Character.isDigit(s.charAt(i + 1)))
                    temp = temp * 10 + s.charAt(++i) - '0';
                rs += sign * stack.peekFirst() * temp;
            }
        }
    return rs;
    }
