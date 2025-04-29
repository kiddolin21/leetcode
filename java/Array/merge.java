public void merge(int A[], int m, int B[], int n) {
       int ai = m-1;
       int bi = n-1;
       int fi = m+n-1;
       
       for(;ai>=0 && bi>=0;fi--) {
           if(A[ai]>B[bi]) {
               A[fi] = A[ai];
               ai--;
           }
           else {
               A[fi] = B[bi];
               bi--;
           }
       }
       
       while(bi>=0) {
           A[fi--] = B[bi--];
       }
    }
