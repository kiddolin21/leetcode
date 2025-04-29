public int minSubArrayLen(int s, int[] nums) {
        int minLength = Integer.MAX_VALUE;
        int left = 0, right = 0, tmpSum = 0, n = nums.length;
        while(right < n) {
            if(tmpSum + nums[right] < s) {
                tmpSum += nums[right];
                right++;
            }
            else {
                minLength = Math.min(minLength, right - left + 1);
                tmpSum -= nums[left];
                left++;
            }
        }
        return minLength == Integer.MAX_VALUE? 0 : minLength;
        
    }
