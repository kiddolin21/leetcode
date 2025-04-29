public boolean containsDuplicate(int[] nums) {
        if(nums.length < 2) return false;
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i : nums) if(!set.add(i)) return true;
        return false;
    }
