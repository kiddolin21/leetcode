public int rob(int[] num) {
        int n = num.length;
        if (n < 2)
            return n == 0 ? 0 : num[0];
        int[] cache = new int[n];
        cache[0] = num[0];
        cache[1] = num[0] > num[1] ? num[0] : num[1];
        for (int i = 2; i < n; i++) {
            cache[i] = cache[i - 2] + num[i];
            cache[i] = cache[i] > cache[i-1]? cache[i] : cache[i-1];
        }
        return cache[n - 1];
    }
