public boolean isMatch(String s, String p) {
        int i = 0, j = 0, match = 0, starIdx = -1;            
        while (i < s.length()){
            // advancing both pointers
            if (j < p.length()  && (p.charAt(j) == '?' || s.charAt(i) == p.charAt(j))){
                i++;
                j++;
            }
            // * found, only advancing pattern pointer
            else if (j < p.length() && p.charAt(j) == '*'){
                starIdx = j;
                match = i;
                j++;
            }
           // last pattern pointer was *, advancing string pointer
            else if (starIdx != -1){
                j = starIdx + 1;
                match++;
                i = match;
            }
           //current pattern pointer is not star, last patter pointer was not *
          //characters do not match
            else return false;
        }

        //check for remaining characters in pattern
        while (j < p.length() && p.charAt(j) == '*')
            j++;

        return j == p.length();
    }
