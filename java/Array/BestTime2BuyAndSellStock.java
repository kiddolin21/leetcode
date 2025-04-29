public int maxProfit(int[] prices) {
        int maxPro = 0, min = Integer.MAX_VALUE;
        for(int p : prices) {
            if(p < min) min = p;
            else maxPro = Math.max(maxPro, p - min);
        }
        return maxPro;
    }
