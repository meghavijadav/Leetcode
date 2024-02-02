class Solution {
    public int trailingZeroes(int n) {
        //Approach
        //Divide by five
        //Accumulate the count
        int count = 0;
        while (n >= 5) {
            n /= 5;
            count += n;
        }

        return count;
    }
}