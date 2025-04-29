 public int divide(int dividend, int divisor) {
        if(divisor==0) return Integer.MAX_VALUE;
        if(divisor==-1 && dividend == Integer.MIN_VALUE)
            return Integer.MAX_VALUE;
            
        int sign = (dividend < 0 == divisor < 0 || dividend == 0)? 1 : -1;
        long den = Math.abs((long)dividend), div = Math.abs((long)divisor);
        int res = 0;
        while(den >= div) {
            int shiftNum = 0;
            while(den >= (div << shiftNum)) shiftNum++;
            
            res += 1 << (shiftNum - 1);
            den -= div << (shiftNum - 1);
        }
        return (sign > 0)? res : -res;
    }
