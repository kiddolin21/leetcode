public int maxArea(int[] height) {
        int n = height.length;
        if(n<2) return 0;
        
        int result = 0,l = 0, r = n-1;
        while(l<r) {
            int area = (r-l)*Math.min(height[l],height[r]);
            if(area>result) result = area;
            
            if(height[l]<height[r]) l++;
            else r--;
        }
        return result;
    }
