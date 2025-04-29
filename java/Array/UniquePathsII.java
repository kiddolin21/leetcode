public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if(obstacleGrid.length < 1 || obstacleGrid[0].length < 1 || obstacleGrid[0][0] == 1) return 0;
        
        int m = obstacleGrid.length, n = obstacleGrid[0].length;
        int[] paths = new int[n];
        paths[0] = 1;
        for(int[] rows : obstacleGrid) 
            for(int i = 0; i < n; i++) {
                if(rows[i] == 1) paths[i] = 0;
                else if(i != 0) paths[i] += paths[i - 1];
            }
        return paths[n - 1];
    }
