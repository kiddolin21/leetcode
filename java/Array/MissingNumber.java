public int missingNumber(int[] nums) {
        long n = (long) nums.length;
        long sum = n * (n + 1) / 2;
        for(int num : nums) {
            sum -= (long) num;
        }
        return (int)sum;
    }
