public int maxProfit(int[] prices) {
        int maxPro = 0;
        for(int i=1;i<prices.length;i++) 
            if(prices[i] > prices[i-1]) maxPro += (prices[i] - prices[i-1]);
        return maxPro;
    }
