public int trailingZeroes(int n) {
        //if(n < 5) return 0;
        //else return n/5 + trailingZeroes(n/5);
        int counter  = 0;
        while(n > 1){
           counter += n / 5;// counter how many fives
           n = n / 5;//counter how many 25s
       }
       return counter;
    }
