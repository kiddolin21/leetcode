public int longestConsecutive(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        int res = 0;
        
        Set<Integer> set = new HashSet<Integer>();
        for(int n : nums) set.add(n);
        
        for(int i = 0; i < nums.length; i++) {
            
            if(!set.contains(nums[i] - 1)) {
                int next = nums[i];
                
                while(set.contains(next)) next++;
                
                res = Math.max(res, next - nums[i]);
            }
        }
        return res;
    }
