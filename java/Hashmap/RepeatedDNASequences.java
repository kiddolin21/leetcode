 public List<String> findRepeatedDnaSequences(String s) {
        List<String> res = new LinkedList<String>();
        Set<Integer> word = new HashSet<Integer>();
        Set<Integer> doubleWord = new HashSet<Integer>();
        int[] map = new int[26];
        map['C' - 'A'] = 1;
        map['G' - 'A'] = 2;
        map['T' - 'A'] = 3;
        
        for(int i = 0; i < s.length() - 9; i++) {
            int v = 0;
            for(int j = i; j < i + 10; j++) {
                v <<= 2;
                v |= map[s.charAt(j)- 'A'];
            }
            if(!word.add(v) && doubleWord.add(v))
                res.add(s.substring(i, i + 10));
        }
        return res;
    }
