public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> subset = new ArrayList<Integer>();
        res.add(subset);
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++) {
            int n = res.size();
            for(int j = 0; j < n; j++) {
                subset = new ArrayList<Integer>(res.get(j));
                subset.add(nums[i]);
                res.add(subset);
            }
        }
        return res;
    }
