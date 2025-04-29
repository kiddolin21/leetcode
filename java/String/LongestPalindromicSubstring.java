public String longestPalindrome(String s) {
        if(s == null) return null;
        String longest = s.substring(0, 1);
        for(int i = 0; i < s.length(); i++) {
            String p1 = count(s, i, i);
            if(p1.length() > longest.length())  longest = p1;
            String p2 = count(s, i, i + 1);
            if(p2.length() > longest.length()) longest = p2;
        }
        return longest;
    }
    
    private String count(String s, int left, int right) {
        while(left >= 0 && right <= s.length() - 1 && s.charAt(left) == s.charAt(right) ) {
            left--;
            right++;
        }
        return s.substring(left + 1, right);
    }
