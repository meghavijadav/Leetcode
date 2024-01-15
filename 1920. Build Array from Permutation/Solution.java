class Solution {
    public int[] buildArray(int[] nums) {

        //Approach 
        //Just apply what's said in the statement.
        //build an array ans of the same length where ans[i] = nums[nums[i]] for each 0 <= i < nums.length and return it.
        int arrayLength = nums.length;
        int[] ans = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            ans[i] = nums[nums[i]];     
        }
        return ans;
    }
}