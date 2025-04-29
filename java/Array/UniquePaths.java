public int uniquePaths(int m, int n) {
        if(m < 1 || n < 1) return 0;
        int[] paths = new int[n];
        for(int j = 0;j < m; j++)
            for(int i = 0; i < n; i++) {
                if(j == 0) paths[i] = 1;
                else if(i == 0) paths[i] = 1;
                else {
                    paths[i] += paths[i - 1];
                }
            }
        return paths[n - 1];
    }
