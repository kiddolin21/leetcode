public int countPrimes(int n) {
        if(n < 2) return 0;
        int counter = 0;
        boolean[] primes = new boolean[n];
        Arrays.fill(primes, true);
        primes[0] = false;
        primes[1] = false;
        
        for(int i = 2; i * i < n; i ++) {
            if(primes[i]) {
                for(int j = 2; j * i < n; j++) primes[i * j] = false;
            }
        }
        for(boolean b : primes) {
            if(b) counter++;
        }
        return counter;
    }
