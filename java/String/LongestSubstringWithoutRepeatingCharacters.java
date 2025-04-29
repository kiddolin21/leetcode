public int lengthOfLongestSubstring(String s) {
        int max = 0, start = 0;
        Map<Character, Integer> lastSeen = new HashMap<Character, Integer>();
        for(int i = 0; i < s.length(); i++) {
            Integer last = lastSeen.get(s.charAt(i));
            
            if(last != null) 
                if(start <= last) {
                    max = Math.max(max, i - start);
                    start = last + 1;
                }
            lastSeen.put(s.charAt(i), i);
        }
        max = Math.max(max, s.length() - start);
        return max;
    }
