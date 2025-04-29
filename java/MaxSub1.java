public int maxSubArray(int[] nums) {
        if(nums.length == 0) return 0;
        
        int prev = nums[0];
        int curr = nums[0];
        int max = nums[0];
        
        for(int i=1;i<nums.length;i++) {
            if(prev>0) prev += nums[i];
            else prev = nums[i];
            max = max>prev? max:prev;
        }
        return max;
    }
