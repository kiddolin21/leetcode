public int findMin(int[] nums) {
        int left = 0, right = nums.length - 1;
        while(left < right) {
            int mid = (left + right) / 2;
            if(nums[left] <= nums[mid] && nums[mid] <= nums[right]) return nums[left];
            else if(nums[left] <= nums[mid]) left = mid + 1;
            else if(nums[mid] <= nums[right]) right = mid;
        }
        return nums[left];
    }
