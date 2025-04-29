public void sortColors(int[] nums) {
        int i = 0,l = 0, r = nums.length-1;
        while(i<=r) {
            if(nums[i]<1) swap(nums,i++,l++);
            else if(nums[i]>1) swap(nums,i,r--);
            else i++;
        }
    }
    
    private void swap(int[] a,int p,int q) {
        int tmp = a[p];
        a[p] = a[q];
        a[q] = tmp;
    }
