public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> path = new ArrayList<Integer>();
        if(matrix.length < 1) return path;
        int nRow = matrix.length - 1;
        int nCol = matrix[0].length - 1;
        int row = 0;
        int col = 0;
        while(col <= nCol && row <= nRow) {
            for(int j = col; j <= nCol; j++)
                path.add(matrix[row][j]);
            for(int i = ++row; i <= nRow; i++)
                path.add(matrix[i][nCol]);
            if(row > nRow) break;
            for(int j = --nCol; j >= col; j--)
                path.add(matrix[nRow][j]);
            if(col > nCol) break;
            for(int i = --nRow; i >= row; i--)
                path.add(matrix[i][col]);
            col++;
        } 
        return path;
    }
