public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        if(n < 1) return matrix;
        int left = 0, right = n - 1, top = 0, bottom = n - 1;
        int count = 1;
        while(left <= right) {
            for(int j = left; j <= right; j++) 
                matrix[top][j] = count++;
            top++;
            for(int i = top; i <= bottom; i++)
                matrix[i][right] = count++;
            right--;
            for(int j = right; j >= left; j--)
                matrix[bottom][j] = count++;
            bottom--;
            for(int i = bottom; i >= top; i--)
                matrix[i][left] = count++;
            left++;
        }
        return matrix;
    }
