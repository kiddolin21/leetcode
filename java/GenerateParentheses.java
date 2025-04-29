public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<String>();
        
        if(n < 1) return res;
        if(n == 1) {
            res.add("()");
            return res;
        }
        
        List<String> list = generateParenthesis(n-1);
        Set<String> set = new HashSet<>();
        for(int i=0;i<list.size();i++){
            String str = list.get(i);
            for(int j=0;j<str.length();j++) set.add(str.substring(0,j)+"()"+str.substring(j));
            set.add(str+"()");
        }
        res.addAll(set);
        return res;
    }
