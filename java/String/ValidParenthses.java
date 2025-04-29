public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        Map<Character, Character> map = new HashMap<>();
        map.put(')','(');
        map.put('}','{');
        map.put(']','[');
        for(char c : s.toCharArray()){
            if(c == '(' || c == '{' || c== '[') stack.push(c);
            else if(stack.isEmpty() || stack.peek() != map.get(c)) return false;
            else stack.pop();
        }
        return stack.isEmpty();
    }
