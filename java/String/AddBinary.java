public String addBinary(String a, String b) {
        if(a.equals("0")) return b;
        if(b.equals("0")) return a;
        
        StringBuilder sb = new StringBuilder();
        int i = 0, carry = 0;
        while(i < a.length() || i < b.length()) {
            int abit = (i >= a.length()) ? 0 : a.charAt(a.length() - 1 - i) - '0';
            int bbit = (i >= b.length()) ? 0 : b.charAt(b.length() - 1 - i) - '0';
            sb.append(0 , (abit + bbit + carry) % 2);
            carry = (abit + bbit + carry) / 2;
            i++;
        }
        return carry > 0 ? sb.append(0, 1).toString() : sb.toString();
    }
