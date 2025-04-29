public int minimumTotal(List<List<Integer>> triangle) {
        if(triangle == null || triangle.size() < 1 || triangle.get(0).size() < 1) return 0;
        int n = triangle.size();
        int[] paths = new int[n + 1];
        
        for(int row = n - 1; row >= 0; row--) 
            for(int i = 0; i < triangle.get(row).size(); i++)
                paths[i] = Math.min(paths[i], paths[i + 1]) + triangle.get(row).get(i);
            
        return paths[0];
    }
