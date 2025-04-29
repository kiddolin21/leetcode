public int lengthOfLIS(int[] nums) {
        int max = 0;
        int[]dp = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            dp[i] = 1;
            for(int j = 0; j < i; j++) {
                if(nums[j] < nums[i] && dp[j] + 1 > dp[i]) 
                    dp[i] = dp[j] + 1;
            }
            max = Math.max(max, dp[i]);
        }
        return max;
    }
