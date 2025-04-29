public int nthUglyNumber(int n) {
        if(n <= 0) return 0;
        List<Integer> nums = new ArrayList<Integer>();
        int a = 0, b = 0, c = 0;
        nums.add(1);
        while(nums.size() < n) {
            int nextVal = Math.min(nums.get(a)*2, Math.min(nums.get(b)*3, nums.get(c)*5));
            nums.add(nextVal);
            if(nums.get(a)*2 == nextVal) a++;
            if(nums.get(b)*3 == nextVal) b++;
            if(nums.get(c)*5 == nextVal) c++;
        }
        return nums.get(n - 1);
    }
