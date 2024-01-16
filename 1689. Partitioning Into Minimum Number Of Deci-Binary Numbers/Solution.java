class Solution {
    public int minPartitions(String n) {
        //Approach
        //Lets say we take a single digit number 8 then we will need 1 which is deci-binary so minimum number of times we'll add is 8 
        //lets say we take 18 then we can add 11 once and 1, 7 times so output is 8
        //if 21 then 10 + 11
        // basically in 21 to make the 2 in tens position well have to add 2 decibinary numbers and 
        //in case of 18 we will have to add 8 decibinary numbers to make 8 in 18
        
        // 1   1
        //+1   0
        //=2   1

        char[] digits = n.toCharArray(); // Convert the string 'n' into an array of characters

        int maxDigit = Character.getNumericValue(digits[0]); // Initialize the variable to store the maximum digit with the value of the first digit

        for (int i = 1; i < digits.length; i++) {
            int x = Character.getNumericValue(digits[i]); // Get the numeric value of the current digit
            maxDigit = Math.max(maxDigit, x);
        }   
        return maxDigit;
    }
}