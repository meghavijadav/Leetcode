class Solution {
    public int findUnsortedSubarray(int[] nums) {
        // We will have two pointers left and right
        // Until left(0) need not to be swapped we shall increment the pointer
        // Until right(n-1) need not to be swapper we shall increment the pointer
        // Then when both needs swapping we will stop and count the number of elements
        // between left and right pointer

        int n = nums.length;
        int left = 0, right = n - 1;

        // Find the first element out of order from the left side
        while (left < n - 1 && nums[left] <= nums[left + 1]) {
            left++;
        }

        if (left == n - 1) {
            // The array is already sorted
            return 0;
        }

        // Find the first element out of order from the right side
        while (right > 0 && nums[right] >= nums[right - 1]) {
            right--;
        }

        // Find the minimum and maximum values within the unsorted part
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int k = left; k <= right; k++) {
            min = Math.min(min, nums[k]);
            max = Math.max(max, nums[k]);
        }

        // Extend the left and right pointers to include elements that need sorting
        while (left > 0 && nums[left - 1] > min) {
            left--;
        }
        while (right < n - 1 && nums[right + 1] < max) {
            right++;
        }

        // Return the length of the unsorted subarray
        return right - left + 1;
    }
}