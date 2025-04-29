public int trap(int[] height) {
        if(height.length < 3) return 0;
        int i = 0, j = height.length - 1, res = 0, plank = 0;
        while(i <= j) {
            plank = Math.max(plank, Math.min(height[i], height[j]));
            res = height[i] >= height[j]? res + (plank - height[j--]) : res + (plank - height[i++]);
        }
        return res;
    }
