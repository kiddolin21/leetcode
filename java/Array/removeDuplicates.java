public int removeDuplicates(int[] A) {
        int n = A.length;
        int newLen = n;
        if(n==0||n==1) return n;
        int curr = 1;
        int prev = 0;
        while(curr<n) {
            if(A[curr]==A[prev]) {
                newLen--;
            }
            else {
                prev++;
                A[prev]=A[curr];
            }
            curr++;
        }
        return newLen;
    }
