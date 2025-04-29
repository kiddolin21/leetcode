public int[] twoSum(int[] nums, int target) {
        int[] index = new int[2];
        if(nums.length < 2) return index;
        
        Map<Integer, Integer> map = new HashMap<Integer,Integer>();
        for(int i = 0; i < nums.length; i++) {
            int remain = target - nums[i];
            if(!map.containsKey(remain)) map.put(nums[i], i);
            else {
                index[0] = map.get(remain) + 1;
                index[1] = i + 1;
                return index;
            }
        }
        return index;
    }
