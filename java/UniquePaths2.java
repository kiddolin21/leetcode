public int uniquePaths(int m, int n) {
        int N = n+m-2;
        int k = m-1;
        
        double ans = 1;
        
        for(int i=1;i<=k;i++) {
            ans = ans * (N-k+i)/i;
        }
        return (int)Math.round(ans);
    }
