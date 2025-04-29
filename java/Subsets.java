public List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        for(int i = 0; i < Math.pow(2, n); i++) {
            List<Integer> subset = new ArrayList<>();
            for(int j = 0; j < n; j++) {
                if(((1 << j) & i) != 0)
                    subset.add(nums[j]);
            }
            Collections.sort(subset);
            res.add(subset);
        }
        return res;
    }
