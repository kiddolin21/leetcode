public int uniquePaths(int m, int n) {
        int[] matrixa = new int[n];
        for(int i = 0; i < n; i++){
            matrixa[i] = 1;
        }
        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                matrixa[j] = matrixa[j] + matrixa[j - 1];
            }
        }

        return matrixa[n - 1];
    }
