class Solution {
    public boolean containsDuplicate(int[] nums) {
        // Approach
        // first sort the array
        // if we start a pointer and the value on n = n+1 then return true as if is
        // duplicated
        // else return false because it doesnt contain duplicates

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true; // Found duplicates
            }
        }

        return false; // No duplicates found
    }

}