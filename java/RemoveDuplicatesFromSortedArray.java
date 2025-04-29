public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        if(nums.length == 1) return 1;
        
        int j = 1;
        for(int i = 1; i < nums.length; i++) {
            if(i < nums.length && nums[i] == nums[i - 1]) continue;
            nums[j++] = nums[i];
        }
        return j;
    }
