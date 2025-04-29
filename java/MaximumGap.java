public int maximumGap(int[] nums) {
        if(nums == null || nums.length < 2) return 0;
        
        int max = nums[0];
        for(int i : nums) max = Math.max(max, i);
        
        int exp = 1;
        int R = 10;
        
        int[] aux = new int[nums.length];
        while(max / exp > 0) {
            int[] bucket = new int[R];
            
            for(int i : nums) {
                bucket[(i / exp) % 10]++;
            }
            
            for(int i = 1; i < 10; i++) {
                bucket[i] += bucket[i - 1];
            }
            
            for(int i = nums.length - 1; i >= 0; i--) {
                aux[--bucket[(nums[i] / exp) % 10]] = nums[i];
            }
            
            for(int i = 0; i < nums.length; i++) {
                nums[i] = aux[i];
            }
            
            exp *= 10;
        }
        
        int res = 0;
        for(int i = 0; i < nums.length -1; i++) {
            res = Math.max(res, nums[i + 1] - nums[i]);
        }
        return res;
    }
