class Solution {
    public int[] getConcatenation(int[] nums) {
        //Approach
        //We need to have 2 for loops
        // One will traverse through the array and print each and every index in a new array
        //second loop will ensure this is done twice so that the new array is of 2n length

        int n = nums.length;
        int[] result = new int[2 * n];

        // First loop: copy the elements of nums to result
        for (int i = 0; i < n; i++) {
            result[i] = nums[i];
        }

        // Second loop: copy the elements of nums to result again
        for (int i = 0; i < n; i++) {
            result[i + n] = nums[i];
        }

        return result;
    
    }
}