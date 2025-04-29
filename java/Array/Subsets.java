public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> allSets = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        allSets.add(subset);
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++) {
            int n = allSets.size();
            for(int j = 0; j < n; j++) {
                subset = new ArrayList<Integer>(allSets.get(j));
                subset.add(nums[i]);
                allSets.add(subset);
            }
        }
        return allSets;
    }
