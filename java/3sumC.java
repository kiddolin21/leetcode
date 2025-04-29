public int threeSumClosest(int[] num, int target) {
        
        int n = num.length;
        if(n<3) return 0;
        Arrays.sort(num);
        int result = num[0] + num[1] + num[n-1];
        for(int i=0;i<n-2;i++) {
            int lo = i+1,hi = n-1;
            while(lo<hi) {
                int sum = num[i]+num[lo]+num[hi];
                if(target == sum) return  target;
                else if(target>sum) lo++;
                else hi--;
                if(Math.abs(target-sum)<Math.abs(target-result)) result = sum;
            }
            
        }
        return result;
    }
