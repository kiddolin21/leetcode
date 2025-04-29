public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        helper(1, k, n, path, res);
        return res;
    }
    
    private void helper(int num, int k, int target, List<Integer> path, List<List<Integer>> res) {
        if(target == 0 && path.size() == k) {
            res.add(new ArrayList<Integer>(path));
            return;
        }
        
        if(target < 0 || num > 10) return;
        
        for(int i = num;i < 10; i++) {
            path.add(i);
            helper(i + 1, k, target - i, path, res);
            path.remove(path.size() - 1);
        }
    }
