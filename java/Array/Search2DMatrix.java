public boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;
        int top = 0, bottom = matrix.length - 1;
        while(top <= bottom) {
            int mid = (top + bottom) / 2;
            if(matrix[mid][0] <= target) {
                row = mid;
                top = mid + 1;
            }
            else bottom = mid - 1;
        }
        int left = 0, right = matrix[0].length - 1;
        while(left <= right) {
            int mid = (left + right) / 2;
            if(matrix[row][mid] == target) return true;
            else if(matrix[row][mid] > target) right = mid - 1;
            else left = mid + 1;
        }
        return false;
    }
