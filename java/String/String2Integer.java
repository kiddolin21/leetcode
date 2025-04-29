public int myAtoi(String str) {
        int MaxDiv10 = Integer.MAX_VALUE / 10;
        int res = 0, sign = 1, i = 0, n = str.length();
        while(i < n && Character.isWhitespace(str.charAt(i))) i++;
        if(i < n && str.charAt(i) == '-') {
            sign = -1;
            i++;
        } else if(i < n && str.charAt(i) == '+') i++;
        
        while(i < n && Character.isDigit(str.charAt(i))) {
            int bit = str.charAt(i) - '0';
            if(res > MaxDiv10 || res == MaxDiv10 && bit >= 8) return sign > 0?Integer.MAX_VALUE : Integer.MIN_VALUE;
            res = res * 10 + bit;
            i++;
        }
        return sign * res;
    }
