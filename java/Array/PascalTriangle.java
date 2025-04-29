public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        if(numRows < 1) return res;
        res.add(Arrays.asList(1));
        for(int i = 1; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for(int j = 0; j <= i; j++) {
                if(j == 0 || j == i) row.add(1);
                else row.add(res.get(i - 1).get(j - 1) + res.get(i - 1).get(j));
            }
            res.add(row);
        }
        return res;
    }
