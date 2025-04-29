public String getHint(String secret, String guess) {
        int bull = 0, cow = 0, n = secret.length();
        int[] numbers = new int[10];
        for(int i = 0; i < n; i++) {
            char s = secret.charAt(i);
            char g = guess.charAt(i);
            
            if(s == g) bull++;
            else {
                if(numbers[s - '0']++ < 0) cow ++;
                if(numbers[g - '0']-- > 0) cow ++;
            }
        }
        return bull + "A" + cow + "B";
    }
