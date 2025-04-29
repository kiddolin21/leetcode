/*I think when we find A[mid] == target, we can continue using binary search to find the left bound or right bound, but before that, check whether it is already the value we are looking for, for left bound: if (mid == 0) or if (A[mid - 1] != target), then we can say that it is the index for left bound.*/
public class Solution {
    public int[] searchRange(int[] A, int target) {
        int[] arr = new int[2];
        arr[0]=searchLeft(A,target);
        arr[1]=searchRight(A,target);
        return arr;
    }
    private int searchLeft(int[] A, int target) {
        int s = 0, e = A.length - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (A[mid] == target) {
                if (mid == 0) {
                    return mid;
                }
                if (A[mid - 1] == target) {
                    e = mid - 1;
                } else {
                    return mid;
                }
            } else if (target > A[mid]) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return -1;
    }
    private int searchRight(int[] A, int target) {
        int s = 0, e = A.length - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (A[mid] == target) {
                if (mid == A.length - 1) {
                    return mid;
                }
                if (A[mid + 1] == target) {
                    s = mid + 1;
                } else {
                    return mid;
                }
            } else if (target > A[mid]) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return -1;
    }
}
