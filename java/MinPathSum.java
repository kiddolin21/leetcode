public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        for(int j=1;j<n;j++)
            grid[0][j] += grid[0][j-1];
        
        for(int i=1;i<m;i++)
            for(int j=0;j<n;j++) {
                if(j>0) {
                    grid[i][j] += Math.min(grid[i-1][j],grid[i][j-1]);
                }
                else grid[i][j] += grid[i-1][j];
            }
        return grid[m-1][n-1];
    }
