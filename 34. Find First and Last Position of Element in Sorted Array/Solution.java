class Solution {
    public int[] searchRange(int[] nums, int target) {
        // nums = [5,7,7,8,8,8,10,11], target = 8
        // first and last index of 8 - 3 and 5 hence [3,5]
        // Easiest way is to start searching from the front and start searching from the
        // back
        // so when we first apply binary search the mid element 8 which is on index 4
        // 8 is our target element and we have got an 8 but it might not be the first 8.
        // so we will apply binary search again in [5,7,7,8] and so on.

        int[] ans = { -1, -1 };
        int start = search(nums, target, true);
        int end = search(nums, target, false);

        ans[0] = start;
        ans[1] = end;
        return ans;
    }

    int search(int[] nums, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            // find the middle element
            // int mid = (start + end)/2;
            // now the problem is that int has a fixed size hence it may happen that
            // 'start+end' may exceed the range of java
            // so the better way to do this is
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                // after this we can say that a potential answer is found
                if (findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }

}