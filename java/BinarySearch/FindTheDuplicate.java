public int findDuplicate(int[] nums) {
        int n = nums.length - 1;
        
        for(int i = 1; i <= n; i++) {
            int count = 0;
            for(int num : nums) {
                if(num == i) count++;
                if(count > 1) return i;
            }
        }
        return -1;
    }
