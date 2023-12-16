class Solution {
    public int removeDuplicates(int[] nums) {
        /*
         * Approach
         * -If the current element and the next element are same then they are
         * duplicates
         * -then you continue further
         * - but if the current element is different from the next element then you need
         * to save it
         * - return the count of the unique elements after removing the duplicates
         */
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                continue;
            } else {
                nums[count] = nums[i];
                count++;
            }
        }
        return count;

    }
}