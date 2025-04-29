public int findPeakElement(int[] nums) {
        int peak = nums[0];
        int i = 1;
        while(i < nums.length && nums[i] > nums[i - 1]) i++;
        return i - 1;
    }
