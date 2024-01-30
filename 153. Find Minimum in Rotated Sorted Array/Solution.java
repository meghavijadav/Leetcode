class Solution {
    public int findMin(int[] nums) {
        // Approach
        // Sort in ascendin order
        // return the element on 0th index
        Arrays.sort(nums);
        return nums[0];
    }
}