public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int diff = Integer.MAX_VALUE, res = 0;
        for(int i = 0; i < nums.length - 2; i++) {
            int sum = target - nums[i];
            int left = i + 1, right = nums.length - 1;
            while(left < right) {
                if(diff > Math.abs(sum - nums[left] - nums[right])) {
                    diff = Math.abs(sum - nums[left] - nums[right]);
                    res = nums[i] + nums[left] + nums[right];
                }
                if(nums[left] + nums[right] == sum) return target;
                else if(nums[left] + nums[right] < sum) left++;
                else right--;
            }
        }
        return res;
    }
