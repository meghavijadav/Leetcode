class Solution {
    public int removeElement(int[] nums, int val) {
        // Approach- We need to check how many numbers are left in the array if we
        // remove the number 'val' from the array.
        // If the array is {3,2,2,3} and val=3 then the output should be 2 as there will
        // be two elements left in the array i.e {2,2}
        // so we will run a j=0 and i wil keep incrementing and check whether the
        // element is equal to val
        // We will also increment to counter- j++ to the next element

        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[j] = nums[i];
                // saving the ement in the same position
                j++;
            }
        }
        return j;
    }
}
