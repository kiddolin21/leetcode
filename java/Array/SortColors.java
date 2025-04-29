public void sortColors(int[] nums) {
        int pvt = 1;
        int left = 0, right = nums.length - 1, i = 0;
        while(i <= right) {
            if(nums[i] < pvt) swap(nums, left++, i++);
            else if(nums[i] > pvt) swap(nums, i, right--);
            else i++;
        }
    }
    
    public void swap(int[] nums, int p, int q) {
        int tmp = nums[p];
        nums[p] = nums[q];
        nums[q] = tmp;
    }
