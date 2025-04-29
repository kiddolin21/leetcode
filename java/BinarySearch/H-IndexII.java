public int hIndex(int[] citations) {
        if(citations == null || citations.length == 0) return 0;
        int n = citations.length;
        int start = 0, end = n - 1, res = 0;
        while(start <= end) {
            int mid = (start + end) / 2;
            if(n - mid <= citations[mid]) {
                res = n - mid;
                end = mid - 1;
            } else start = mid + 1;
        }
        return res;
    }
