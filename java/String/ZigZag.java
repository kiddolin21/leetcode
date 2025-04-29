public String convert(String s, int numRows) {
        if(s == null || numRows < 2) return s;
        StringBuilder[] buffers = new StringBuilder[numRows];
        int base = 2 * numRows - 2;
        for(int i = 0; i < numRows; i++) 
            buffers[i] = new StringBuilder();
        for(int i = 0; i < s.length(); i++) {
            int pos = i % base;
            if(pos < numRows) buffers[pos].append(s.charAt(i));
            else buffers[base - pos].append(s.charAt(i));
        }
        for(int i = 1; i < numRows; i++) 
            buffers[0].append(buffers[i]);
        return buffers[0].toString();            
    }
