public int countDigitOne(int n) {
        int k = n, factor = 1, count = 0;
        while(k > 0) {
            int m = k / 10, r = k % 10, amount;
            if(r == 0) amount = 0;
            else if(r > 1) amount = factor;
            else amount = n % factor + 1;
            
            count += m * factor + amount;
            factor *= 10;
            k /= 10;
        }
        return count;
    }
