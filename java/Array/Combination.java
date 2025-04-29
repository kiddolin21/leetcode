public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<List<Integer>>> dp = new ArrayList<>();
        
        for(int i = 1; i <= target; i++) {
            List<List<Integer>> sumList = new ArrayList<>();
            
            for(int j = 0; j < candidates.length; j++) {
                if(candidates[j] > i) break;
                if(candidates[j] == i) sumList.add(Arrays.asList(candidates[j]));
                else for(List<Integer> l : dp.get(i - 1 - candidates[j])) {
                    if(l.get(0) >= candidates[j]) {
                        List<Integer> cl = new ArrayList<Integer>();
                        cl.add(candidates[j]); cl.addAll(l);
                        sumList.add(cl);
                    }
                }
            }
            dp.add(sumList);
        }
        return dp.get(target - 1);
    }
