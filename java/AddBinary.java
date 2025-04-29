public String addBinary(String a, String b) {
        if(a=="0") return b;
        if(b=="0") return a;
        StringBuilder sb = new StringBuilder();
        int i=0;
        int carry=0;
        while(i<a.length()||i<b.length()){
            int adig = (i<a.length())? a.charAt(a.length()-1-i)-'0':0;
            int bdig = (i<b.length())? b.charAt(b.length()-1-i)-'0':0;
            int sum = bdig + adig + carry;
            carry = sum/2;
            sb.insert(0,sum%2);
            i++;
        }
        if(carry == 1)
            sb.insert(0,1);
        return sb.toString();
    }
