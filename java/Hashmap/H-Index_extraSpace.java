public int hIndex(int[] citations) {
       if(citations.length == 0) return 0;
       int len = citations.length;
       int[] count = new int[len + 1];
       
       for(int c : citations) {
           if(c > len) count[len]++;
           else count[c]++;
       }
       
       int res = 0;
       for(int i = len; i >= 0; i--) {
           res += count[i];
           if(res >= i) return i;
       }
       return 0;
    }
