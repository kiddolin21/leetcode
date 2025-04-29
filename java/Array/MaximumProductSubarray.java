public int maxProduct(int[] nums) {
        int ans = nums[0], max = ans, min = ans;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] >= 0) {
                max = Math.max(nums[i], max * nums[i]);
                min = Math.min(nums[i], min * nums[i]);
            }
            else {
                int tmp = max;
                max = Math.max(nums[i], min * nums[i]);
                min = Math.min(nums[i], tmp * nums[i]);
            }
            ans = Math.max(ans, max);
        }
        return ans;
    }
