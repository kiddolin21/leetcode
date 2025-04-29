public List<String> letterCombinations(String digits) {
        LinkedList<String> res = new LinkedList<String>();
        if(digits.length() == 0) return res;
        String[] map = {" ","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        
        res.add("");
        for(int i=0;i<digits.length();i++) {
            int index = digits.charAt(i)-'0';
            while(res.peek().length() == i) {
                String t = res.remove();
                for(char s:map[index].toCharArray())
                    res.add(t+s);
            }
        }
        return res;
    }
