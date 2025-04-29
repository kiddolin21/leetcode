public int mySqrt(int x) {
        if(x==0 || x==1) return x;
        
        int low = 1, high = x,ans = 1;
        while(low<=high) {
            int mid = (low+high)/2;
            if(mid <= x/mid) {
               low = mid + 1;
               ans = mid;
            }
            else high = mid -1;
        }
        return ans;
    }
