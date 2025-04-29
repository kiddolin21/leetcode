public String convert(String s, int nRows) {
        if(nRows<=1) return s;
        StringBuilder[] sb = new StringBuilder[nRows];
        for( int i=0; i<nRows; i++ )
           sb[i] = new StringBuilder();
        int base = 2*nRows-2;
        char[] toks = s.toCharArray();
        for(int i=0;i<toks.length;i++) {
            int t = i%base;
            if(t<nRows) sb[t].append(toks[i]);
            else sb[base-t].append(toks[i]);
        }
        for(int i=1;i<nRows;i++)
            sb[0].append(sb[i]);
        return sb[0].toString();
    }
