public int searchInsert(int[] A, int target) {
        int n = A.length;
        for(int i=0;i<n;i++) {
            if(A[i]>=target) {
                return i;
            }
        }
        return n;
    }
