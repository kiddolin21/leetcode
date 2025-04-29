public boolean search(int[] A, int target) {
        int start = 0;
        int end = A.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (A[mid] == target) // case 0
                return true;
            // finally start == mid == end, if case 0, return true, else end the loop
            else if (A[start] == A[mid])
                start++;
            else if (A[end] == A[mid])
                end--;
            else if (A[start] <= target && target <= A[mid]) // case 1
                end = mid;
            else if (A[mid] < target && target <= A[end]) // case 2
                start = mid + 1;
            else if (A[start] > A[mid]) // case 2 is false, so target in this range
                end = mid;
            else   // case A[mid] > A[end] and case 1 is false, similar to above
                start = mid + 1;
        }
        return false;
    }
