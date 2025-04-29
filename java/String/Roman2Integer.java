public int romanToInt(String s) {
        if(s == null) return 0;
        Map<Character, Integer> map = new HashMap<Character, Integer>(){{
            put('I', 1);put('V', 5);
            put('X', 10);put('L', 50);
            put('C', 100);put('D', 500);
            put('M', 1000);
        }};
        int res = 0, prev = 1000;
        for(int i = 0; i < s.length(); i++) {
            int bit = map.get(s.charAt(i));
            if(bit > prev) res -= 2 * prev;
            res += bit;
            prev = bit;
        }
        return res;
    }
