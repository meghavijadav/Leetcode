class Solution {
    public int firstMissingPositive(int[] nums) {
        //Aproach 
        //First sort the Array
        //Start a pointer if the value is negative move forward
        //move forward ie increment till the value of the number is 0 now after this which ever next number is missing return its value
        //If 1 is missing then give it as the output 
        // if 1 is present then return 2 
        //if 2 is present then return 3
        //lets say the array is 5,6,7,8 then the code should return 1 
        Arrays.sort(nums);

        int missing = 1;

        for (int num : nums) {
            if (num <= 0) {
                continue;
            }

            if (num == missing) {
                missing++;
            } else if (num > missing) {
                return missing;
            }
        }

        return missing;
    }
}