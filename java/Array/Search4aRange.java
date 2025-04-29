public int[] searchRange(int[] nums, int target) {
        int[] index = { -1, -1 };
        int left = 0, right = nums.length - 1;
        while(left <= right) {
            int mid = (left + right) / 2;
            if(nums[mid] == target) {
                index[0] = mid;
                index[1] = mid;
                int i = mid - 1, j = mid + 1;
                while(i >= 0 && nums[i] == target) i--;
                while(j < nums.length && nums[j] == target) j++;
                index[0] = i + 1;
                index[1] = j - 1;
                break;
            }
            else if(nums[mid] > target) right = mid - 1;
            else left = mid + 1;
        }
        return index;
    }
