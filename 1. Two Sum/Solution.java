class Solution {
    public int[] twoSum(int[] nums, int target) {
        // We need to return the index here.
        // Approach- So we need two numbers of different indices. So we will take two
        // pointers i and j. Let us say there are 5 numbers in the array so 'i' will go
        // from 0 to 3 and 'j' will be 'i+1'.
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    int a[] = { i, j };
                    return a;
                }
            }
        }
        return null;
    }
}