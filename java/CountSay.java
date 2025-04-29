public String countAndSay(int n) {
        String s = "1";
        for(int i=1;i<n;i++)
            s = say(s);
        return s;
    }
    
    public String say(String s){
        StringBuilder sb = new StringBuilder();
        int count=0;
        char c = s.charAt(0);
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i)!=c) {
                sb.append(count);
                sb.append(c);
                c = s.charAt(i);
                count = 1;
            }
            else {
                count++;
            }
        }
        sb.append(count);
        sb.append(c);
        return sb.toString();
    }
