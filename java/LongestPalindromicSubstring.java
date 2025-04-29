public String longestPalindrome(String s) {
        int n = s.length();
        if(n<1) return "";
        
        String longest = s.substring(0,1);
        for(int i=0;i<n-1;i++) {
            String p1 = findPalindrome(s,i,i);
            if(p1.length()>longest.length()) longest = p1;
            
            String p2 = findPalindrome(s,i,i+1);
            if(p2.length()>longest.length()) longest = p2;
        }
        return longest;
    }
    private String findPalindrome(String s, int l, int r){
        while(l>=0 && r<=s.length()-1 && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }
        return s.substring(l+1,r);
    }
