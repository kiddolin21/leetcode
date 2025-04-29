public void nextPermutation(int[] nums) {
        int i = nums.length-1;
        for(;i>0;i--)
            if(nums[i-1]<nums[i]) break;
            
        if(i!=0) {
            for(int j=nums.length-1;j>=i;j--) {
                if(nums[j]>nums[i-1]) {
                    swap(nums,i-1,j);
                    reverse(nums,i);
                    break;
                }
            }
        } else {
            reverse(nums,0);
        }
    }
    
    private void swap(int[] a,int p,int q) {
        int tmp = a[p];
        a[p] = a[q];
        a[q] = tmp;
    }
    
    private void reverse(int[] a,int i) {
        int first = i;
        int last = a.length-1;
        while(first<last){
            swap(a,first,last);
            first ++;
            last --;
        }
    }
