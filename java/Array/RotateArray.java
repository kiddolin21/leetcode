public void rotate(int[] nums, int k) {
        if(nums == null || nums.length < 0) return;
        int n = nums.length;
        int K = k % n;
        reverse(nums, 0, n - 1); 
        reverse(nums, 0, K - 1);
        reverse(nums, K, n - 1);
        
    }
    
    private void reverse(int[] nums, int left, int right) {
        while(left < right) {
            int tmp = nums[left];
            nums[left] = nums[right];
            nums[right] = tmp;
            left++;
            right--;
        }
    }
