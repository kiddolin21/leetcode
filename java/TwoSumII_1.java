public class Solution {
	    public int[] twoSumII(int[] numbers, int target) {
	    	for(int i=0;i<numbers.length;i++) {
	    		int j = binarySearch(numbers,target,i);
	    		if(j!=1) {
	    			return new int[] {i+1,j+1};
	    		}
	    	}
			return null;
	    }
	    
	    private int binarySearch(int[] A,int key,int start) {
	    	int L  = start,R = A.length - 1;
	    	while(L<R) {
	    		int M = (L+R)/2;
	    		if(A[M]>key) {
	    			R = M;
	    		}
	    		else {
	    			L = M+1;
	    		}
	    	}
	    	return(L==R&&A[L]==key)?L:-1;
	    }
	}
