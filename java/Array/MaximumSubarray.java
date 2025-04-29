public int maxSubArray(int[] nums) {
        int[] maxSub = new int[nums.length];
        maxSub[0] = nums[0];
        int max = nums[0];
        for(int i = 1; i < nums.length; i++) {
            maxSub[i] = Math.max(maxSub[i - 1] + nums[i], nums[i]);
            max = Math.max(max,maxSub[i]);
        }
        return max;
    }
