public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> allSets = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        helper(allSets, subset, 0, nums);
        return allSets;
    }
    
    private void helper(List<List<Integer>> allSets, List<Integer> subset, int pos, int[] nums) {
        if(pos <= nums.length) allSets.add(subset);
        
        int i = pos;
        while(i < nums.length) {
            subset.add(nums[i]);
            helper(allSets, new ArrayList<Integer>(subset), i + 1, nums);
            subset.remove(subset.size() - 1);
            i++;
            while(i < nums.length && nums[i] == nums[i - 1]) i++;
        }
        return;
    }
