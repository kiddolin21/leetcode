public int lengthOfLIS(int[] nums) {
        int len = 0;
        int[] dp = new int[nums.length];
        for(int x : nums) {
            int i = Arrays.binarySearch(dp,0, len, x);
            if(i < 0) i = -(i + 1);
            dp[i] = x;
            if(i == len) len++;
        }
        return len;
    }
