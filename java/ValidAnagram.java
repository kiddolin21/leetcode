public boolean isAnagram(String s, String t) {
       if(s == null || t == null || s.length() != t.length()) return false;
        int[] count = new int[26];
        int len = t.length();
        for(int i = 0; i < len; i++) {
            count[t.charAt(i) - 'a']++;
        }
        for(int i = 0; i < len; i++) {
            char c = s.charAt(i);
            if(count[c - 'a'] > 0) {
                count[c - 'a']--;
            } else {
                return false;
            }
        }
        return true;
    }
