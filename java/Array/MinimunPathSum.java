public int minPathSum(int[][] grid) {
        int m = grid.length;
        if(m < 1) return 0;
        int n = grid[0].length;
        int[] minPath = new int[n];
        for(int i = 0; i < m; i++)
            for(int j = 0; j < n; j++) {
                if(i == 0 && j != 0) minPath[j] = grid[i][j] + minPath[j - 1];
                else if(j == 0) minPath[j] += grid[i][j];
                else minPath[j] = grid[i][j] + Math.min(minPath[j - 1], minPath[j]);
            }
        return minPath[n - 1];
    }
