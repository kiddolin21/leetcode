public void moveZeroes(int[] nums) {
        if(nums == null || nums.length < 2) return;
        int i = 0, newi = 0;
        while(i < nums.length) {
            while(i < nums.length && nums[i] == 0) i++;
            if(i < nums.length) nums[newi++] = nums[i++];
        }
        while(newi < nums.length) nums[newi++] = 0;
    }
