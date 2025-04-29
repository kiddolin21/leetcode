public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        if(nums.length < 3) return res;
        for(int i = 0; i < nums.length - 2; i++) {
            if(i > 0 && nums[i] == nums[i - 1]) continue;
            int left = i + 1, right = nums.length - 1;
            while(left < right) {
                if(nums[i] + nums[left] + nums[right] == 0) {
                    res.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    while(left < right && nums[++left] == nums[left - 1]);
                    right--;
                }
                else if(nums[i] + nums[left] + nums[right] > 0) right--;
                else left++;
            }
        }
        return res;
    }
