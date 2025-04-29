public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length,n = matrix[0].length;
        int row = searchColumn(matrix,target,m);
        return searchRow(matrix,target,row,n);
    }
    
    private int searchColumn(int[][] a,int t,int m) {
        int r = 0,low = 0,high = m-1;
        while(low<=high) {
            int mid = (low+high)/2;
            if(a[mid][0] <= t) {
                r = mid;
                low = mid + 1;
            }
            else high = mid - 1;
        }
        return r;
    }
    
    private boolean searchRow(int[][] a,int t,int r,int n) {
        int low = 0,high = n-1;
        while(low<=high) {
            int mid = (low+high)/2;
            if(a[r][mid] == t) return true;
            else if(a[r][mid]<t) low = mid + 1;
            else high = mid - 1;
        }
        return false;
    }
