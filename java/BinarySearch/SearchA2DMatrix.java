public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int row = bsRow(matrix, 0, m - 1, 0, target);
        if(row == -1) return true;
        int col = bsCol(matrix, 0, n - 1, target);
        if(col == -1) return true;
        for(int j = 1; j <= col; j++) if(bsRow(matrix, 1, row, j, target) == -1) return true;
        return false;
    }
    
    private int bsRow(int[][] matrix, int start, int end, int col, int target) {
        int row = 0;
        while(start <= end) {
            int mid = (start + end) / 2;
            if(matrix[mid][col] == target) return -1;
            else if(matrix[mid][col] < target) {
                row = mid;
                start = mid + 1;
            } else end = mid - 1;
        }
        return row;
    }
    
    private int bsCol(int[][] matrix, int start, int end, int target) {
        int col = 0;
        while(start <= end) {
            int mid = (start + end) / 2;
            if(matrix[0][mid] == target) return -1;
            else if(matrix[0][mid] < target) {
                col = mid;
                start = mid + 1;
            }
            else end = mid - 1;
        }
        return col;
    }
