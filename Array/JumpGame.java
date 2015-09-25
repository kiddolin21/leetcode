public boolean canJump(int[] nums) {
        int index = 0, range = 0;
        while(index <= range) {
            range = Math.max(range, index + nums[index++]);
            if(range >= nums.length - 1) return true;
        }
        return false;
    }
