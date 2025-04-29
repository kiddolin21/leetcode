public String minWindow(String s, String t) {
        if(s == null || t == null || t.length() > s.length()) return "";
        
        //character counter to t
        Map<Character, Integer> target = new HashMap<Character, Integer>();
        for(char c : t.toCharArray()) {
            if(target.containsKey(c)) target.put(c, target.get(c) + 1);
            else target.put(c, 1);
        }
        
        //character counter to s
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        String res = "";
        int count = 0, left = 0, minLen = s.length() + 1;
        
        //go through the s
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            //if the character is in target
            if(target.containsKey(c)) {
                if(map.containsKey(c)) {
                    if(map.get(c) < target.get(c)) 
                        count++;
                    //if count is enough, just accept the duplicates, can be used to choose start of res
                    map.put(c, map.get(c) + 1);
                } else {
                    map.put(c, 1);
                    count++;
                }
            } else continue;
            
            //if count is enough, check the substring 
            if(count == t.length()) {
                char sc = s.charAt(left);
                while(!map.containsKey(sc) || map.get(sc) > target.get(sc)) {
                    if(map.containsKey(sc) && map.get(sc) > target.get(sc)) map.put(sc, map.get(sc) - 1);
                    left++;
                    sc = s.charAt(left);
                }
                
                if(i - left + 1 < minLen) {
                    res = s.substring(left, i + 1);
                    minLen = i - left + 1;
                }
            }
        }
        return res;
    }
