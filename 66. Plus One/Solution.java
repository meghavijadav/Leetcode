class Solution {
    public int[] plusOne(int[] digits) {
        /*
         * for(int i = digits.length -1; i > 0; i--){
         * if(digits[i] < 9){
         * digits[i]++;
         * return digits;
         * }
         * else digits[i] = 0;
         * 
         * }
         * //int[] nums = new int[digits.length + 1];
         * //nums[0] = 1;
         * //return nums;
         * 
         * digits = new int[digits.length + 1];
         * digits[0] = 1;
         * return digits;
         */

        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;

    }
}