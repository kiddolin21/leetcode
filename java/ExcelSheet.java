public String convertToTitle(int n) {
        StringBuilder sb = new StringBuilder();
        while(n>0){
            sb.append(tableTrans(n%26));
            n=(n-1)/26;
        }
        return sb.reverse().toString();
    }
    
    private char tableTrans(int n) {
        return n==0?'Z':(char)(64+n);
    }
