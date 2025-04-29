 public String convertToTitle(int n) {
        if(n < 1) return null;
        StringBuilder sb = new StringBuilder();
        while(n != 0){
            sb.insert(0, num2Char(n%26));
            n = (n - 1) / 26;
        }
        return sb.toString();
    }
    public Character num2Char(int digit) {
        return digit == 0 ?'Z' :(char) ('A' + digit - 1);
    }
