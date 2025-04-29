public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates); 
        List<List<List<Integer>>> dp = new ArrayList<>();
        
        for(int i=1;i<=target;i++) {
            List<List<Integer>> sumList = new ArrayList<>();
            
            for(int j=0;j<candidates.length&&candidates[j]<=i;j++) {
                if(candidates[j] == i) sumList.add(Arrays.asList(candidates[j]));
                else for(List<Integer> l: dp.get(i-candidates[j]-1)) {
                        if(l.get(0) >= candidates[j]) {
                            List cl = new ArrayList<>();
                            cl.add(candidates[j]); cl.addAll(l);
                            sumList.add(cl);
                        }
                }
            }
            dp.add(sumList);
        }
        return dp.get(target-1);
    }
